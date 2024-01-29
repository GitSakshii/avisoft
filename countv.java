import java.util.Scanner;
public class countv {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String vowel="aeiou";
        String other="~!#$%^&*() 1234567890-=?<>;'\"";
        int v=0,c=0,o=0;
        for(int i=0;i<s.length();i++)
        {
            if(vowel.contains(s.charAt(i)+""))
            {
                v++;
            }
            else if(other.contains(s.charAt(i)+""))
            {
               o++;
            }
            else {
                c++;
            }
        }
        System.out.println("Number of Vowels :"+ v);
        System.out.println("Number of Consonents: "+c);
        System.out.println("Number of other Characters "+o);
    }
}
