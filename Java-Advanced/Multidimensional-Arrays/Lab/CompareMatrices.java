import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] firstArrayMeta = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [][] firstArray = new int[firstArrayMeta[0]][firstArrayMeta[1]]; // meta[0] = rows; meta[1] = data on row
            //creating the first array using meta information given by user
        for (int i = 0; i < firstArrayMeta[0]; i++) {
          String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < firstArrayMeta[1]; j++) {
                firstArray[i][j] = Integer.parseInt(input[j]);
            }
        }

        //instead of creating second one we will just check if the input matches since it is not required to print it
        // therefore this information will only stay in memory

        int[] secondArrayMeta = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(secondArrayMeta[0] == firstArrayMeta[0] && secondArrayMeta[1] == firstArrayMeta[1]){

           // int[][] secondArray = new int[secondArrayMeta[0]][secondArrayMeta[1]];

            for (int i = 0; i < secondArrayMeta[0]; i++) {
                int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                for (int j = 0; j < secondArrayMeta[1]; j++) {
                    if(input[j] != firstArray[i][j]){
                        System.out.println("not equal");
                        return;
                    }
                }
            }
        }else{
            System.out.println("not equal");
            return;
        }
        System.out.println("equal");
        //System.out.println(Arrays.deepToString(firstArray));
    }
}