import java.util.Scanner;

public class patternpro {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int k=i;
            for(int j=0;j<i;j++)
            {
                System.out.print(k);
                k++;
            }

            k-=2;
            for(int j=1;j<i;j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }


    }
}
