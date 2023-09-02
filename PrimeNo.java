import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        if(prime5(num))
          System.out.println("Yes.. num is prime...");
        else
          System.out.println("No....num is not prime...");
    }
    static boolean prime1(int num){
        if(num == 2 || num == 3)
          return true;
        else{
            for(int i=1;i<=num;i++){
                if(6*i+1 == num)
                 return true;
                else if(6*i-1 == num)
                  return true; 
            }
            return false;
        }  
    }
    static boolean prime2(int num){
        if(num == 1) return false;
        for(int i=2;i<num;i++){
            if(num%i == 0)
             return false;
        }
        return true;
    }
    static boolean prime3(int num){
        if(num == 1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i == 0)
              return false;
        }
        return true;
    }
    static boolean prime4(int num){
        if(num == 1) return false;
        if(num == 2 || num == 3)
          return true;
        if(num%2 == 0) return false;
        if(num%3 == 0) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i == 0)
              return false;
        }
        return true;
    }
    static boolean prime5(int num){
        if(num == 1) return false;
        if(num == 2 || num == 3)
          return true;
        if(num%2 == 0) return false;
        if(num%3 == 0) return false;
        for(int i=5;i*i<=num;i=i+6){
            if(num%i == 0 || num%(i+2) == 0)
              return false;
        }
        return true;
    }
}
