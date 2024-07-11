/*3 To accept n numbers ,store into array and display array numbers in ascending order. */



import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many no:");
        int n=sc.nextInt();
        int[] arr=new int[10];
        System.out.println("enter eleents in arrya:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        int temp;
        for(int i=0;i<n;i++)
        {   for(int j=i+1;j<n;j++)
            {
            if (arr[i]>arr[j])
             { temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
             }
            }
        }
        System.out.println("Asending :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }
}