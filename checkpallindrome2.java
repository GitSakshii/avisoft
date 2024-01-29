import java.util.Scanner;

public class checkpallindrome2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Boolean isp=true;
        String str=Integer.toString(n);
        int l=str.length();
        for(int i=0;i<l/2;i++)
        {
            if(str.charAt(i)!=str.charAt(l-i-1))
            {
                isp=false;
                break;
            }
        }
        if(isp)
        {
            System.out.println("The given number is a pallindrome");
        }
        else {
            System.out.println("The given number is not a pallindrome");
        }
    }


}
