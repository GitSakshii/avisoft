import java.util.Arrays;
import java.util.Scanner;

public class uniquee
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            arr[(int)(ch-97)]++;

        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==1){
            System.out.print(Character.toString ((char) (i+97))+",");}
        }
    }
}
