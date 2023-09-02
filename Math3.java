import java.util.*;
public class Math3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        int fact = factorialUsingRecussion(n);
     
        System.out.println("No of trailing zero = "+trailingZerosEffective(n));
    }
    static int Factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact *i;
        }
        return fact;
    }
    static int factorialUsingRecussion(int n){
        if(n == 0 || n == 1)
          return 1;
        return n*factorialUsingRecussion(n-1);  
    }
    static int trailingZeros(int fact){
        int i = 0,k = 0;
        while(fact != 0){
            i = fact%10;
            if(i == 0){
             k++;
             fact = fact/10;
            }
            else 
              break; 
        }
        return k;
    }
    static int trailingZerosEffective(int n){
        int res =0;
        for(int i=5;i<=n;i=i*5){
            res = res+(n/i);
        }
        return res;
    }
}
