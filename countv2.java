import java.util.Scanner;

public class countv2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0,v=0,o=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v++;
            }
            else if(ch>=97&&ch<=122)
            {
                c++;
            }
            else {
                o++;
            }
        }
        System.out.println("Number of Vowels :"+ v);
        System.out.println("Number of Consonents: "+c);
        System.out.println("Number of other Characters "+o);

    }
}
