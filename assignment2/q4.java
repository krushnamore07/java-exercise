/*4 To accept n numbers ,store into array and display sum of all even numbers and sum of all odd
numbers. */

import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("enter how many element:");
        int n=sc.nextInt();
        System.out.println("enter elements in array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("arry:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int evensum=0,oddsum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                evensum+=arr[i];
            }
            else
            {
                oddsum+=arr[i];
            }
        }
        System.out.println("Even no sum:"+evensum);
        System.out.println("odd no sum:"+oddsum);
    }
}
