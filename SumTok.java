// Java Program that reads a line of integers and then displays each integer 
// and sum of all the integers(use string tokenizer class of java.util)
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
class SumTok 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the "+ n +" number(space separated)");
        String numList=sc.nextLine();
        StringTokenizer st = new StringTokenizer(numList);//Splitting the given String
        int sum=0;
        while(st.hasMoreTokens())
        {
            sum=sum + Integer.parseInt(st.nextToken());
        }
        System.out.println("Sum ="+sum);
    }
}             



