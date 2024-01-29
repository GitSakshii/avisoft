import java.util.Scanner;

public class patternstar {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n/2+1;i++)
        {
            for(int k=i;k<n/2;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=2*i;k<n-2;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
