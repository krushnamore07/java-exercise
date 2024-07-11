/*18.Display number in word.e.g. n=268 output => two six eight */
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        String[] word = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        

        String result = ""; 

        while (n > 0)
         {
            int digit = n % 10;
            result = word[digit] + " " + result; 
            n/=10;
        }

        System.out.println("Word representation: " + result);
    }
}
