import java.util.Scanner;

public class MatrixOperations_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns for the matrices: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter elements of matrix1:");
        inputMatrix(matrix1, scanner);

        System.out.println("Enter elements of matrix2:");
        inputMatrix(matrix2, scanner);

        boolean exit = false;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayMatrix(addMatrices(matrix1, matrix2));
                    break;
                case 2:
                    displayMatrix(subtractMatrices(matrix1, matrix2));
                    break;
                case 3:
                    displayMatrix(multiplyMatrices(matrix1, matrix2));
                    break;
                case 4:
                    System.out.println("Transposed Matrix1:");
                    displayMatrix(transposeMatrix(matrix1));
                    System.out.println("Transposed Matrix2:");
                    displayMatrix(transposeMatrix(matrix2));
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (!exit);

        scanner.close();
    }

    private static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("Matrix:");

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
