
/*1. Check number is positive or negative.*/
// class Demo
// {
//  public static void main(String[] args)
//   {
//     int number=Integer.parseInt(args[0]);
//     if(number>0)
//     {
//         System.out.println("number is positive");
//     }
    //   else if(number==0)
    //   {
    //     System.out.println("no is zero");
    //   }
//     else
//     {
//         System.out.println("number  is negative ");
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
         if(number>0)
    {
        System.out.println("number is positive");
    }
      else if(number==0)
      {
        System.out.println("no is zero");
      }
    else
    {
        System.out.println("number  is negative ");
    }
     
    
}
}