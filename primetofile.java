import java.io.*;
import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        // Input file containing numbers
        String inputFileName = "input_numbers.txt";
        // Output file to write prime or not prime status
        String outputFileName = "prime_status.txt";

        // Read numbers from the input file
        int[] numbers = readNumbersFromFile(inputFileName);

        // Check if each number is prime and write the result to the output file
        writePrimeStatusToFile(numbers, outputFileName);
    }

    private static int[] readNumbersFromFile(String fileName) {
        int[] numbers = new int[100]; // Assuming a maximum of 100 numbers

        try (Scanner scanner = new Scanner(new File(fileName))) {
            int index = 0;
            while (scanner.hasNextInt()) {
                numbers[index++] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void writePrimeStatusToFile(int[] numbers, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < numbers.length && numbers[i] != 0; i++) {
                int num = numbers[i];
                String status = isPrime(num) ? "Prime" : "Not Prime";
                writer.write(num + ": " + status + "\n");
            }
            System.out.println("Prime status has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
