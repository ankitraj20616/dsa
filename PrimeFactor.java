import java.util.*;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int n = sc.nextInt();
        primeFactor5(n);

    }
    static void primeFactor1(int n){
        int i = 2;
        while(n != 1){
            if(prime(i) && n%i == 0){ 
                System.out.println(i);
                n = n/i;
            }
            if(n%i != 0)
              i++;
        }
    }
    static void primeFactor2(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                int x = i;
                while(n%x == 0){
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }
    static boolean prime(int n){
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i == 0 || n%(i+2) == 0)
              return false;
        }
        return true;
    }
    static void primeFactor3(int n){
        if(prime(n)){
            System.out.println(n);
            return;
        }
        for(int i=2;i*i<=n;i++){
            if(prime(i) && n%i == 0){
                int x = n;
                while(x%i == 0){
                    System.out.println(i);
                    x = x/i;
                }
            }
        }
    }
    static void primeFactor4(int n){
        if(n<=1)
         return;
        for(int i=2;i*i<=n;i++){
            while(n%i == 0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>1)
         System.out.println(n);
    }
    static void primeFactor5(int n){
        if(n<=1)
          return;
        int x = 2;
        while(x<=3){
            if(n%x == 0){
                System.out.println(x);
                n = n/x;
            }
            else
              x++;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i == 0){
                System.out.println(i);
                n = n/i;
            }
            while(n%(i+2) == 0){
                System.out.println(i+2);
                n = n/(i+2);
            }
        }
        if(n>1)
         System.out.println(n);

    }
}
