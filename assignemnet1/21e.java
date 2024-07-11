/*
1
12
123
1234
 */

 import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter where you want to print:");
        int n=sc.nextInt();
         int j=0;
        for(int i=1;i<n;i++)
        {
            for( j=1;j<=i;j++)
            {
            //  char alpahebet=(char)('A'+j);
             System.out.print(j);
            }
            System.out.println();
        }
    }
}
    
