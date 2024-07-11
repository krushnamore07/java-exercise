/*12 Accept n and display nXn identity matrix. */
/* 6 Accept a matrix and display it.*/
import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n to display n*n:");
        int n=sc.nextInt();
       
        int[][] matrix=new int[10][10];
        
        System.out.println("matrix:");
        for(int i=0;i<n;i++)
        { 
             for(int j=0;j<n;j++)
            { 
                if(i==j)
                {
                   System.out.print(1+" ");
                }
                else
                {
                   System.out.print(0+" ");
                }  
            }
                System.out.println();
           
        }
            System.out.println();
        }
 }


