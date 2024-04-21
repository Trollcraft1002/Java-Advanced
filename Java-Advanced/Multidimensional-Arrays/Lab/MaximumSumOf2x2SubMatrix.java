import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixMeta = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = matrixMeta[0];
        int cols = matrixMeta[1];

        int[][] matrix = new int[rows][cols];

        //creating and mapping the matrix
        for (int i = 0; i < rows; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input[j];
            }
        }
            int sum = 0;
            int[] location = new int[4];
        for (int i = 0; i < matrixMeta[0] ; i++) {
            for (int j = 1; j < matrixMeta[1]; j++) {
                int sumA = matrix[i][j-1] + matrix[i][j];
                if(i==matrixMeta[0]-1){
                    break;
                }
                int sumB = matrix[i+1][j-1] + matrix[i+1][j];
                if(sumA+sumB > sum){
                    sum=sumA+sumB;
                    location[0] = matrix[i][j-1];
                    location[1] = matrix[i+1][j-1];
                    location[2] = matrix[i][j];
                    location[3] = matrix[i+1][j];
                }
            }
        }

        //location seems to be misplaced, but it will do the job done
        System.out.printf("%d %d%n%d %d%n", location[0], location[2], location[1], location[3]);
        System.out.println(sum);
    }
}
