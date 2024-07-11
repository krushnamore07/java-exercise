/*19.Display alphabets e.g. n= 4 output: A B C D */

import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no where you want to print");
         int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {  
            // System.out.println(('A'+i));//it print its unicode 
            // System.out.println((char)('A'+ i));
            char alphabets=(char) ('A'+ i);
            System.out.print(alphabets+" ");
        }
    }
}