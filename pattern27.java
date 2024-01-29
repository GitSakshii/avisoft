import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=2*i+1;j<=2*n-1;j+=2)
            {
                System.out.print(j+" ");
            }
            for(int k=1;k<2*i+1;k+=2)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
