package Revision_from_start1;
import java.util.*;
public class mathsRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int num = sc.nextInt();
        // System.out.println("Number of digits in number is = "+function1(num));
        // checkPalindrome(num);
        // System.out.println("Factorial of number = "+factorialOfNum2(num));
        //  System.out.println("Number of trailing zeros = "+trailiingZeros2(num));
       /* System.out.println("Enter value of a =");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.println("HCF of a and b = "+GCD3(a, b));   
        System.out.println("LCM of a and b = "+LCM(a, b));  */ 
       /* if(checkPrime3(num))
          System.out.println("Number is prime....");
        else
          System.out.println("Number is not prime....");   */
        // primeFactors3(num);  
        // allDivisors2(num);
        // printAllPrime3(num);
        System.out.println("Enter it's power = ");
        int pow = sc.nextInt();
        System.out.println("It's solution is = "+computingPower2(num, pow));
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
    static void checkPalindrome(int num){
        int x = num;
        int y = 0;
        while (x>0) {
            y = y*10+(x%10);
            x = x/10;
        }
        if(y == num)
          System.out.println("Number is palindrome..");
        else
          System.out.println("Number is not palindorme....");  
    }
    static int factorialOfNum1(int num){
        if(num < 1)
          return 1;
        int res = 1;
        for(int i=2;i<=num;i++)
          res = res * i;
        return res;  
    }
    static int factorialOfNum2(int num){
        if(num <= 1)
          return 1;
        return num * factorialOfNum1(num-1);  
    }
    static int trailiingZeros1(int num){
        int fact = factorialOfNum1(num);
        int count = 0;
        while (fact%10 == 0) {
            count++;
            fact = fact / 10;
        }
        return count;
    }
    static int trailiingZeros2(int num){
      int res = 0;
      for(int i=5;i<=num;i=i*5)
        res = res+(num/i);
      return res;  
    }
    static int GCD1(int a,int b){
      int res = 0;
      int min = Math.min(a, b);
      while (min > 0) {
        if(a%min == 0 && b%min == 0){
          res = min;
          break;
        }
        min--;
      }
      return res;
    }
    static int GCD2(int a,int b){
      while (a != b) {
        if(a>b)
          a = a-b;
        else
          b = b-a;  
      } 
      return a;
    }
    static int GCD3(int a,int b){
      if(a == 0)
        return b;
      return GCD3(b%a, a);  
    }
    static int LCM(int a,int b){
      return (a*b)/GCD3(a, b);
    }
    static boolean checkPrime1(int num){
      if(num == 1)
        return false;
      for(int i=2;i<num;i++){
        if(num%i == 0)
          return false;
      }
      return true;
    }
    static boolean checkPrime2(int num){
      if(num == 1)
        return false;
      for(int i=2;i*i<=num;i++){
        if(num%i == 0)
          return false;
      }
      return true;
    }
    static boolean checkPrime3(int num){
      if(num == 1)
        return false;
      if(num == 2 || num == 3)
       return true;
      if(num%2 == 0 || num%3 == 0)
        return false;
      for(int i=5;i*i<=num;i=i+6){
        if(num%i == 0 || num%(i+2) == 0)
          return false;
      }     
      return true;
    }
    static void primeFactors1(int num){
      for(int i=2;i<=num;i++){
        while(num%i == 0){
          System.out.print(i+" ");
          num = num/i;
        }
      }
    }
    static void primeFactors2(int num){
      for(int i=2;i*i<=num;i++){
        while(num%i == 0){
          System.out.print(i+" ");
          num = num/i;
        }
      }
      if(num >1)
       System.out.print(num);
    }
    static void primeFactors3(int num){
      if(num <= 1)
        return;
      while (num%2 == 0) {
        System.out.print(2+" ");
        num = num/2;
      }
      while(num%3 == 0){
        System.out.print(3+" ");
        num = num/3;
      }
      for(int i=5;i*i<=num;i=i+6){
        while (num%i == 0) {
          System.out.print(i+" ");
          num = num/i;
        }
        while (num%(i+2) == 0) {
          System.out.print((i+2)+" ");
          num = num/(i+2);
        }
      }
      if(num>3)
        System.out.print(num);
    }
    static void allDivisors1(int num){
      System.out.println("All divisors of number = ");
      for(int i=1;i<=num;i++){
        if(num%i == 0)
          System.out.print(i+" ");
      }
    }
    static void allDivisors2(int num){
      System.out.println("All divisors of number = ");
      int i;
      for(i=1;i*i<=num;i++){
        if(num%i == 0)
          System.out.print(i+" ");
      }
      for( ;i>=1;i--){
        if(num%i == 0)
          System.out.print((num/i)+" ");
      }
    }
    static void printAllPrime1(int num){
      for(int i=2;i<=num;i++){
        if(checkPrime3(i))
          System.out.print(i+" ");
      }
    }
    static void printAllPrime2(int num){
      boolean []arr = new boolean[num+1];
      Arrays.fill(arr,true);
      for(int i=2;i<arr.length;i++){
        if(i == 2 || i == 3 || i == 5)
          continue;
        if(i%2 == 0 || i%3 == 0 || i%5 == 0)
          arr[i] = false;
      }
      for(int i=2;i<arr.length;i++){
        if(arr[i])
          System.out.print(i+" ");
      }
    }
    static void printAllPrime3(int num){
      boolean []arr = new boolean[num+1];
      Arrays.fill(arr, true);
      for(int i=2;i*i<=num;i++){
        if(arr[i]){
          for(int j=i*2;j<=num;j=j+i)
             arr[j] = false;
        }
      }
      for(int i=2;i<arr.length;i++){
        if(arr[i])
          System.out.print(i+" ");
      }
    }
    static void printAllPrime4(int num){
      boolean []arr = new boolean[num+1];
      Arrays.fill(arr, true);
      for(int i=2;i*i<=num;i++){
        if(arr[i]){
          for(int j=i*i;j<=num;j=j+i)
             arr[j] = false;
        }
      }
      for(int i=2;i<arr.length;i++){
        if(arr[i])
          System.out.print(i+" ");
      }
    }
    static int computingPower1(int num,int pow){
      int res = 1;
      while(pow>0){
        res = res*num;
        pow--;
      }
      return res;
    }
    static int computingPower2(int num,int pow){
      if(pow == 0)
        return 1;
      int temp = computingPower2(num, pow/2) * computingPower2(num, pow/2);
      if(pow%2 == 0)
        return temp;
      else
        return temp * num;   
    }
    static int computingPower3(int num,int pow){
      int res = 1;
      while (pow>0) {
        if(pow%2 != 0){
          res = res*num;
          pow = pow-1;
        }
        num = num*num;
        pow = pow/2;  
      }  
      return res;
    }
}
