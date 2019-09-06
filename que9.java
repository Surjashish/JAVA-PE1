import java.util.Scanner;
public class que9{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=in.nextLine();
        int l=s.length();
        while((l)>0){
            System.out.print(s.charAt(l-1));
            l-=1;

        }
    }
}
