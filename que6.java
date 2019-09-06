import java.util.Scanner;
public class que6{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a character");
        char c=in.next().charAt(0);
        int ascii=(int)c;
        if(ascii>=97&&ascii<=122)
        {
            System.out.println("Lowercase"); c=1;
        }
        if(ascii>=65&&ascii<=90)
        {
            System.out.println("Uppercase");c=1;
        }
        if(ascii>=48&&ascii<=57)
        {
            System.out.println("digit");c=1;

       }
        else { if(c!=1||c==' ')
        System.out.println("Special character");
        }
    }
}

