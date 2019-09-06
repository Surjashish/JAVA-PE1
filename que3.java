import java.util.Scanner;
public class que3{
 public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String S = in.nextLine();
        String s=S.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char k=s.charAt(i);
            if(k>='a'&&k<='z')
            {
                if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')
                {
                    System.out.println("The type of letter "+S.charAt(i)+" is Vowel");
                }
                else
                System.out.println("The type of letter "+S.charAt(i)+" is Consonant");

            }
            else
            {
                if(s.charAt(i)==' ')
                System.out.println("The type of letter "+S.charAt(i)+" is Space");
                else
                System.out.println("The type of letter "+S.charAt(i)+" is not a letter or space");
            }
        }

    }
}
