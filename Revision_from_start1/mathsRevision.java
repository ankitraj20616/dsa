package Revision_from_start1;
import java.util.*;
public class mathsRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int x = sc.nextInt();
        System.out.println("Number of digits in number is = "+function1(x));
    }
    static int function1(int x){
        if(x<0)
          return -1;
        int count = 0;
        while(x>0){
            count++;
            x = x/10;
        }  
        return count;
    }
}
