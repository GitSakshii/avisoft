import java.util.Scanner;

public class dectobin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        String ans="";
        while(n!=0)
        {
            r=n%2;
            ans=ans+r;
           n=n/2;

        }
        int l=ans.length();
        String nans="";
        for(int i=l-1;i>=0;i--)
        {
           nans+=ans.charAt(i);
        }
        System.out.println(nans);
    }
}
