import java.util.Scanner;
import java.io.*;
public class que5{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        
        int c=0,s=0;
        while(c==0)
        {
            System.out.println("Enter a number");
            int n=in.nextInt();
            s=s+n;
            System.out.println("Wanna continue entering numbers? Enter yes if you want to");
            String choice=ob.readLine(); 
            choice=choice.toLowerCase();
            System.out.println("Choice: "+choice);


            if(choice.equals("yes"))
            {
                c=0;
        
            }
            else c=1;

        }
        System.out.println("Sum is "+s);
        System.out.println("Number wasn't entered or loop was stopped!!");
    }
}