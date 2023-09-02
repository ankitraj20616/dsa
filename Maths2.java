import java.util.*;
public class Maths2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int n = sc.nextInt();
        isPalindrome(n);
    }
    static void isPalindrome(int n){
        int rev = 0;
        int x = n;
        while(n!=0){
            int i = n%10;
            rev = rev*10+i;
            n = n/10;
        }
        if(x == rev)
          System.out.println("Number is palindrome.....");
        else
          System.out.println("Number is not palindrome.....");  
    }
}
