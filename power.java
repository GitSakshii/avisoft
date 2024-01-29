import java.util.Scanner;

public class power {
    public static void main(String[] args)
    {
      int x,n,ans=1;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      n=sc.nextInt();
      for(int i=0;i<n;i++){
          ans*=x;
      }
        System.out.println(ans);
    }
}
