import java.util.Scanner;

public class MatrixOfPalindromes {
    private static void printMatrixPattern(String[][] matrix) {
        for (String[] arr : matrix) {
            for (String row : arr) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                    char outsideChar = (char) ('a' + i);
                    char insideChar = (char) ('a' + i + j);
                    //workaround on char to string
                    matrix[i][j] = String.valueOf(outsideChar) + insideChar + outsideChar;
            }
        }
        printMatrixPattern(matrix);
    }
}
