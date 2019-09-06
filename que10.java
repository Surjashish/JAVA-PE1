import java.util.Scanner;
public class que10{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=in.nextLine();
        System.out.println("Enter a number");
        int n=in.nextInt();
        int l=s.length();
        int begin=l-n;
        String crop=s.substring(begin,l);
        System.out.print(s);
        while(n>1)
        {
        System.out.print(crop);
        n--;
        }
    }
}

