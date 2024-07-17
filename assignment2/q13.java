/*13 Accept a matrix and display sum of diagonal number of matrix */
/* 6 Accept a matrix and display it.*/
/***Akash Giri****/
import java.util.Scanner;

class Demo 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many row:");
        int row=sc.nextInt();
        System.out.println("enter how many col:");
        int col=sc.nextInt();
        int[][] matrix=new int[10][10];
        System.out.println("enter elementtss in matrix:");
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
            matrix[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("matrix:");
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<row;i++)
        {  for(int j=0;j<col;j++)
            {
               if(i==j)
               {
                sum+=matrix[i][j];
               }
            }  
        }
        System.out.println("sum of diagonal:"+sum);
        
    }
}

