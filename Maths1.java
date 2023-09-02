import java.util.*;
public class Maths1 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int n = X.nextInt();
        int digit = countUsingLog(n);
        System.out.println("No of deigit in no is = "+digit);
    }
    static int countUsingLoop(int n){
        int i;
        for(i=0;n!=0;i++){
            n=n/10;
        }
        return i;
    }
    static int countUsingRecurssion(int n){
        if(n == 0)
         return 0;
        return (1+countUsingRecurssion(n/10)); 
    }
    static int countUsingLog(int n){
        return (int)Math.floor(Math.log10(n)+1);
    }
}

