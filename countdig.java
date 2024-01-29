import java.util.Scanner;
public class countdig {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println(1);
            return;
        }
        int res=0;
        while(n!=0)
        {
          n=n/10;
          res++;

        }
        System.out.println(res);

    }
}
