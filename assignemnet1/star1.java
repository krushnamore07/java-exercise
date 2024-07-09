/*6. Display n stars (*).
e.g. Accept number from command line argument as n=5
output: * * * * *   */
class Demo
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for (int i=0;i<n;i++)
        {
            System.out.print("* ");
        }
    }
}
