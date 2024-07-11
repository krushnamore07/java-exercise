/*
A
BC
DEF
GHIJ
 */

import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter where you want to print:");
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
             char alpahebet=(char)('A'+count);
             System.out.print(alpahebet);
             count++;
            }
            System.out.println();
        }

       
    
    }
}


class Demo3 {

    public static void main(String[] args) {
        // int a=Integer.parseInt(args[0]);
        // int[] arr=new int[a];
        try
        {   
            int a=Integer.parseInt(args[0]);
            try
            {
            int[] arr=new int[a];
            }
            catch(NegativeArraySizeException nae)
            { 
            System.out.println("array index is negative");
             nae.printStackTrace();
            }
        }
        catch(NumberFormatException e2)
       {
        System.out.println("enter an integer ");
       }
       catch(ArrayIndexOutOfBoundsException e3)
       {
        System.out.println("array index not found ");
       }
       catch(Exception e)
       {
         e.printStackTrace();
       }
    //    int[] arr=new int[a];
}
}
