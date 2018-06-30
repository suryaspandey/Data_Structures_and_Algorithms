//Author : Surya Pandey
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Diagonal_Difference {

    static int diagonalDifference(int[][] arr) {
        int n = arr[0].length;
        int sum =0;

        int sum1 = 0;
        int sum2 = 0;
        int i,j;
        System.out.println(n);
        for(i=0;i < n; i++) {
            sum2 = arr[i][n-i-1]+sum2;
            sum1 = sum1 + arr[i][i];
        }
        sum = sum1 - sum2;
        if(sum>=0)
            return sum;
        else {
            sum = (-1)*(sum);
            return sum;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


