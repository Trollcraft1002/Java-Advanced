import java.util.Scanner;

public class FillTheMatrix {

    public static void printMatrixPattern(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private static int[][] MethodA(int[][] matrix) {
        //Creating matrix model A
        //1 4 7
        //2 5 8
        //3 6 9
        int sum = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                matrix[j][i] = sum;
                sum += 1;
            }
        }
        return  matrix;
    }

    private static int[][] MethodB(int[][] matrix) {
        //Creating matrix B
        // 1 6 7
        // 2 5 8
        // 3 4 9
        int sum = 1;
        for (int i = 0; i < matrix.length; i++) {
            //checking if row is odd https://www.geeksforgeeks.org/print-matrix-snake-pattern/
            if (i % 2 != 0) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = sum;
                    sum += 1;
                }
            } else {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = sum;
                    sum += 1;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int matrixMeta = Integer.parseInt(input[0]);
        String method = input[1];
        //crating the matrix
        int[][] matrix = new int[matrixMeta][matrixMeta];


        if (method.equals("A")) {
            printMatrixPattern(MethodA(matrix));
        }
        if (method.equals("B")) {
            printMatrixPattern(MethodB(matrix));
        }
    }
}
