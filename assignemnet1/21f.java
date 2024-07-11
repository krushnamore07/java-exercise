/*
ABCDE
ABCD
ABC
AB
A
 */

 import java.util.Scanner;

 class Demo
 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter where you want to print:");
         int n=sc.nextInt();
         
         
         for (int i = n; i >= 1; i--) {
             for (int j = 1; j <= i; j++) {
                 char alphabet = (char) ('A' + j - 1);
                 System.out.print(alphabet);
             }
             System.out.println();
         }
     
     }
 }
 
