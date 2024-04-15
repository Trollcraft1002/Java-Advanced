import java.util.Scanner;

public class RecursiveFibonacci {

    static  int []term = new int [1000];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(fib(n));
    }

    //1-D Memoization | https://www.geeksforgeeks.org/memoization-1d-2d-and-3d/
    static int fib(int n) {
        // base case
        if (n <= 1)
            return n;

        // if fib(n) has already
        // been computed we do not
        // do further recursive
        // calls and hence reduce
        // the number of repeated
        // work
        if (term[n] != 0)
            return term[n];

        else {

            // store the computed value
            // of fib(n) in an array
            // term at index n to so that
            // it does not needs to be
            // precomputed again
            term[n] = fib(n - 1) +
                    fib(n - 2);

            return term[n];
        }
    }
}
