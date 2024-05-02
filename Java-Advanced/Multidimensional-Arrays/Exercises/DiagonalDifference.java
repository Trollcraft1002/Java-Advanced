import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifferenceRightToLeft(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    public static int diagonalDifferenceLeftToRight(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixMeta = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[matrixMeta][matrixMeta];
        //building the matrix from input
        for (int i = 0; i < matrixMeta; i++) {
                matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

        int a = diagonalDifferenceLeftToRight(matrix);
        int b = diagonalDifferenceRightToLeft(matrix);
        System.out.println(Math.abs(a - b));
    }
}
