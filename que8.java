import java.util.Scanner;
public class que8{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number between 1-100 and let's see where your guess takes you(target is preset ;) ) ");
        int n=in.nextInt();
        int target=73;
        boolean guess=false;
        if(n!=target)
        {
            while(guess==false)
            {
               if(n>target)
               {
                System.out.println("Number guessed is more than target number ");
                System.out.println("Enter a smaller number ");
                n=in.nextInt();
               }
               else
               if(n<target)
               {
                System.out.println("Number guessed is lesser than target number ");
                System.out.println("Enter a bigger number ");
                n=in.nextInt();

               }
               else
               {
                System.out.println("Number guessed is right!! ");
                guess=true;

               }



            }
        }
        else
        {
            System.out.println("Number guessed is right!! ");
        }

    }
}
