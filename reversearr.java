import java.util.Scanner;
public class reversearr {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
           int tmp=arr[i];
           arr[i]=arr[n-i-1];
           arr[n-i-1]=tmp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
