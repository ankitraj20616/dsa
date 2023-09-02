import java.util.*;
public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int n = sc.nextInt();
        allDivisors3(n);

    }
    static void allDivisors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i == 0)
             System.out.print(i+" ");
        }
    }
    //This will not print all the divisors in sorted order
    static void allDivisors2(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
             System.out.print(i+" ");
              if(i != (n/i))
                System.out.print(" "+(n/i)+" ");
        }
    }
    }
    static void allDivisors3(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i == 0)
              System.out.println(i);
        }
        for( ;i>=1;i--){
            if(n%i == 0)
             System.out.println(n/i);
        }
    }
}
