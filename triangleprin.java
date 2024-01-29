import java.util.Scanner;

public class triangleprin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int sum = 1;
            System.out.print("1");
            for (int j = 2; j <= i; j++) {
                sum += j;
                System.out.print("+" + j);
            }
            if(sum==1) {System.out.println("=" +1);}
            else {
                System.out.println("=" + sum);
            }
        }

    }
}
