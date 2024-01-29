import java.util.Scanner;
public class oddeve {
    public static void main(String[] args)
    {
        int n,r,eve=0,odd=0;

        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        while(n!=0)
        {
           r=n%10;
           if(r%2==0)
           {
               eve+=r;
           }
           else{
               odd+=r;
           }
           n=n/10;

        }
        System.out.println("Sum of odd digits: "+ odd);
        System.out.println("Sum of even digits: " +eve);
    }
}
