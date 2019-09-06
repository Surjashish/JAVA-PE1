import java.util.Scanner;
public class que1{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int sum=0;
        String num=String.valueOf(n);
        StringBuilder sb=new StringBuilder(num);
        String numRev=sb.reverse().toString();
        System.out.println(numRev);
        Integer Reverse=Integer.valueOf(numRev);
        
        if(Reverse==n)
        {
            System.out.println("Number is Palindrome");
            int length=numRev.length();
            for(int i=0;i<length;i++)
            {
                if(i%2!=0)
                {  
                      char k=(num.charAt(i));
                    System.out.println(k);
                    int a =Character.getNumericValue(k);
                    sum = sum+a;
                }

            }
            if(sum>25){

            
            System.out.println("sum is more than 25 with a value of "+sum);
            }
            else{
                System.out.println("sum is less than 25");
            }
        }
        else{
            System.out.println("Not a Palindrome number");
        }




    }

}