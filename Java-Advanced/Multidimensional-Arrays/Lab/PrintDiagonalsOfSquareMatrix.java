import java.util.*;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixMeta = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixMeta][matrixMeta];
        int[] mainDiagonal = new int[matrixMeta];
        int[] secondaryDiagonal = new int[matrixMeta];

        // Input matrix elements
        for (int i = 0; i < matrixMeta; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < matrixMeta; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        // Extract diagonal elements
        for (int i = 0; i < matrixMeta; i++) {
            mainDiagonal[i] = (matrix[i][i]);
            secondaryDiagonal[i] = (matrix[i][matrixMeta - 1 - i]);
        }

        // Output diagonal elements
        for (int a : mainDiagonal){
            System.out.printf("%d ", a);
        }
        System.out.printf("%n");

        for(int a : secondaryDiagonal){
            System.out.printf("%d ", a);
        }
    }
}
