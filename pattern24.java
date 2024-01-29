import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l;
        for(int i=n-1;i>=0;i--)
        {
            l=i;
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print((char)(l+65));
               l++;
            }
            System.out.println();
        }
    }
}
