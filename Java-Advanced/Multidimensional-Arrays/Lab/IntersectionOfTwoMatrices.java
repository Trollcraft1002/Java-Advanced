import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[row][col];


        //getting the first array
        for (int i = 0; i < row; i++) {
            String [] input = scanner.nextLine().split(" ");
            System.arraycopy(input, 0, matrix[i], 0, col);
        }

        //comparing the first array with the second directly from input
        for (int i = 0; i < row; i++) {
            String[] compareWith = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                if (compareWith[j].equals(matrix[i][j])){
                    System.out.printf("%s ", compareWith[j]);
                }else{
                    System.out.print("* ");
                }
            }
            System.out.printf("%n");
        }

    }
}
