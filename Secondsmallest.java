import java.util.Scanner;

public class SecondSmallestElement_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int secondSmallest = findSecondSmallest(array);

        System.out.println("The second smallest element in the array is: " + secondSmallest);

        scanner.close();
    }

    private static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest && value != smallest) {
                secondSmallest = value;
            }
        }

        return secondSmallest;
    }
}
