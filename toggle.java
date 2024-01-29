import java.util.Scanner;

public class toggle {
    public static void main(String[] args)
    {
        System.out.println("Please Enter Text");
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String ans="";
        /*char ch[]=str.toCharArray();*/

        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch>=97&&ch<=122)
            {
                ans=ans+(char)(ch-32);
            }
            else if(ch>=65&&ch<=90)
            {
                ans=ans+(char)(ch+32);
            }
            else {
                ans=ans+ch;
            }
        }
        System.out.println(ans);
    }
}




 /*if( Character.isUpperCase(ch[i]))
            {
              ch[i] = Character.toLowerCase(ch[i]);
            }
         else if(Character.isLowerCase(ch[i]))
            {
             ch[i]=Character.toUpperCase(ch[i]);
         }
        }
        str=new String(ch);
        System.out.println(str);*/