/*
AAAA
BBBB
CCCC
DDDD
 */
import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter where you want to print:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {   char alpahebet=(char)('A'+i);
            for(int j=0;j<=n;j++)
            {
            //  char alpahebet=(char)('A'+i);
             System.out.print(alpahebet);
            }
            System.out.println();
        }
    }
}
