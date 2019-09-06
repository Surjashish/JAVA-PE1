
import java.util.Scanner;
public class que2{
 public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        if(n>20&&n<30)
        {
            if(n%2==0)
            {
                System.out.println("Jerry");
            }
            else
            System.out.println("Tom");
        }
        else
        System.out.println("Number not between 20 to 30");
    }
}
