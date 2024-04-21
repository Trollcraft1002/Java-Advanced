import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        //creating the matrix and printing its meta information
        int[][] matrix = new int[rows][cols];
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int sum = 0;

        //filling the matrix and summing the data in it
        for (int i = 0; i < rows; i++) {
            String[] array = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(array[j]);
                sum += Integer.parseInt(array[j]);

            }
        }
        System.out.println(sum);
    }
}
