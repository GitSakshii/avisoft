import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l,n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l=i;
           for (int j=0;j<=i;j++)
           {

               System.out.print((char)(l+65) + " ");
               l++;
           }
            System.out.println();
        }
    }
}
