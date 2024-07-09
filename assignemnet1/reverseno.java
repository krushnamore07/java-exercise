/*13.Display reverse number.*/
import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no where you want to print:");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}


