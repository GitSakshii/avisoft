import java.util.Scanner;

public class reversenum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r,ans=0;
        int n=sc.nextInt();
        while(n!=0){
            r=n%10;
            n=n/10;
            ans=ans*10+r;

        }
        System.out.println(ans);
    }
}
