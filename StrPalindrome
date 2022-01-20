//Java Program to find the given String is Palindrome or not
import java.util.Scanner;
class StrPalindrome
{
  public static void main(String args[])
  {
    System.out.println("Enter the String:");
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    int flag = 0; // flag =0 means Palindrome
    int len = str.length();
    for(int i=0; i<= len/2; i++)
      {
      if(str.charAt(i) != str.charAt(len-1-i))
        {
          flag=1; // flag=1 means not palindrome
          break;
         }
  }
  if(flag==0)
    System.out.println(str + "is Palindrome");
  else
    System.out.println(str + "is not Palindrome");
  }
}
