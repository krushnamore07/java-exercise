/*10 To display multiplication of two matrices . */

import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many row:");
        int row=sc.nextInt();
        System.out.println("enter how many col:");
        int col=sc.nextInt();
        int[][] matrix1=new int[10][10];
        int[][] matrix2=new int[10][10];
        int[][] matrix3=new int[10][10];
        System.out.println("enter elementtss in matrix1:");
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
            matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix1:");
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
            System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter elementtss in matrix2:");
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
            matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix2:");
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
            System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        
       
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
          {
            matrix3[i][j]=0;
            for(int k=0;k<col;k++)
            {
             matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
            }
          }
           
        }
        System.out.println("multiplication of matrix1*matrix2 :");
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
            System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
      
        
    }
}



