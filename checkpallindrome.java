import java.util.Scanner;

public class checkpallindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int r,rev=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;

            rev=(10*rev)+r;

        }

        if(org==rev)
        {
            System.out.println("The given number is a pallindrome");
        }
        else {
            System.out.println("The given number is not a pallindrome");
        }
    }
}
