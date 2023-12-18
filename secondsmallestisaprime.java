import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondSmallestPrimeWriter {

    public static void main(String[] args) {
        // Input array from the user during compilation
        int[] array = getInputArray();

        // Find the second smallest element
        int secondSmallest = findSecondSmallest(array);

        // Check if the second smallest element is a prime number
        if (isPrime(secondSmallest)) {
            // Write the prime number to a file
            writeToFile(secondSmallest);
            System.out.println("Second smallest prime number has been written to the file.");
        } else {
            System.out.println("Second smallest element is not a prime number.");
        }
    }

    private static int[] getInputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
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

    private static void writeToFile(int num) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(Integer.toString(num));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
