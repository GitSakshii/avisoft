import java.util.Scanner;
public class factors {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean hasfactor=false;
         for(int i=2;i<=n/2;i++)
         {
             if(n%i==0)
             {
                 System.out.println(i);
                 hasfactor=true;
             }
         }
         if(hasfactor=false)
         {
             System.out.println(-1);
         }

    }
}
