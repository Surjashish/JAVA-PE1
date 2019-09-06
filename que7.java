import java.util.Scanner;
import java.util.Arrays;;
import java.util.Collections;
public class que7{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        String s=String.valueOf(n);
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=Character.getNumericValue(s.charAt(i));

        }
        Arrays.sort(arr);
        int sumEven=0;
        System.out.println("Sorted Number in non-increasing order: ");

        for(int i=0;i<s.length();i++)
        {
            System.out.print(arr[s.length()-i-1]);
            if(arr[i]%2==0)
            sumEven=sumEven+arr[i];
        }
        
        System.out.println("");
        System.out.println("sum" + sumEven);

        if(sumEven<=15)
                System.out.println("False");
        else
                System.out.print("true");





    }
}