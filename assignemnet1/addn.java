/*11.Display addition of first n numbers. */
import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no where you want to print:");
        int n=sc.nextInt();
        int add=0;
        for(int i=0;i<=n;i++)
        {    
           System.out.println(i);
           add+=i;
        }
        System.out.println("addition is :"+add);
    }
}

