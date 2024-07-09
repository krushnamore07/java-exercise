/*3. Check number is even or odd. */
// class Demo
// {
//  public static void main(String[] args)
//   {
//     int number=Integer.parseInt(args[0]);
//     if(number%2==0)
//     {
//         System.out.println("number even");
//     }
//     else
//     {
//         System.out.println("number  is odd ");
//     }
//  }   
// }
import java.util.Scanner;
class Demo
{
public static void main(String[] args) 
{    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no to check:");
     int number=sc.nextInt();
     if(number%2==0)
    {
        System.out.println("number even");
    }
    else
    {
        System.out.println("number  is odd ");
    }
      
     
    
}
}