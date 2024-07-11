/*
****
****
****
****

 */
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n = sc.nextInt();
        /*The outer loop (for (int i = 1; i <= n; i++)) runs from i = 1 to i = n.
For each value of i, the inner loop (for (int j = 1; j <= i; j++))
 runs from j = 1 to j = i. */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}


