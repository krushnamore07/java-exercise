
/*2. Find maximum of two numbers.*/
// class Demo
// {
//  public static void main(String[] args)
//   {
//     int number1=Integer.parseInt(args[0]);
//     int number2=Integer.parseInt(args[1]);
//     if(number1>number2)
//     {
//         System.out.println(number1+ " number1 is max ");
//     }
//     else
//     {
//         System.out.println(number2+" number2 is max ");
//     }
//  }   
// }
import java.util.Scanner;
class Demo
{
public static void main(String[] args) 
{    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no1:");
     int number1=sc.nextInt();
     System.out.println("enter no2:");
     int number2=sc.nextInt();
     if(number1>number2)
         {
             System.out.println(number1+ " number1 is max ");
         }
         else
         {
             System.out.println(number2+" number2 is max ");
         }
    
     
    
}
}
