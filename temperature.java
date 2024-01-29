import java.util.Scanner;
public class temperature {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Start and end temperature");
       int st,en;
       st=sc.nextInt();
       en=sc.nextInt();
        System.out.println("Step Size");
        int w=sc.nextInt();
        for(int i=st;i<en;i+=w)
        {
            int c=(i-32)*5/9;
            System.out.println(i+" farenheit ="+ c + " celcius");
        }

    }
}
