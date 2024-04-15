import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayMeta = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[arrayMeta[0]][arrayMeta[1]];
            //creating the array based on the meta given by user
        for (int i = 0; i <arrayMeta[0] ; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arrayMeta[1] >= 0) System.arraycopy(input, 0, matrix[i], 0, arrayMeta[1]);
        }

        int numberToFind = Integer.parseInt(scanner.nextLine());

        boolean result = false;
            //iterating though the matrix finding the number and printing it's location
        for (int i = 0; i < arrayMeta[0]; i++) {
            for (int j = 0; j < arrayMeta[1]; j++) {
                if (numberToFind == matrix[i][j]) {
                    System.out.printf("%d %d%n", i, j);
                    result = true;
                }
            }
        }

        if(!result) System.out.println("not found");
        //System.out.println(Arrays.deepToString(matrix));
    }
}
