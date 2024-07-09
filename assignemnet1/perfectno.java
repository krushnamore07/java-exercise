/*16.Check given number is perfect or not. */
//perfect no:suppose 6 =so all its factor 1,2,3addition also 6 
import java.util.Scanner;
class Demo
{  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter no:");
         int originalNum=sc.nextInt();
         int num=originalNum;
         int sum=0;
         for(int i=1;i<=num/2;i++)
         {
                if(num %i==0)
                sum+=i;
         }
         if(originalNum==sum)
         {
            System.out.println("no is perfect");
         }
         else
         {
            System.out.println("not");
         }
    }
}