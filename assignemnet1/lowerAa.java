/*20.Display following output. e.g. n=5 output: Aa Bb Cc Dd Ee */


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
            char alphabets1=(char) ('A'+ i);
            char alphabets2=(char) ('a'+ i);
            System.out.print(alphabets1+""+alphabets2+""+" ");
        }
    }
}
