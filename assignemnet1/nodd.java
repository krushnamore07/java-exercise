/*10. Display first n odd numbers. */
import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no where you want to print:");
        int n=sc.nextInt();
        
        for(int i=0;i<=n;i++)
        {    if(i%2!=0)
            System.out.println(i);
        }
    }
}

