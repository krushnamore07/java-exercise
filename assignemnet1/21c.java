/*
A
AB
ABC
ABCD
 */

import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter where you want to print:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
             char alpahebet=(char)('A'+j);
             System.out.print(alpahebet);
            }
            System.out.println();
        }
    }
}
