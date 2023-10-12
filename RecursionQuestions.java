import java.util.*;
public class RecursionQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of n = ");
        // int n = sc.nextInt();
         System.out.print("Enter your String = ");
         String wrd = sc.next();
        /* if(checkPalindrome(wrd, 0, wrd.length()-1))
           System.out.println("Palindrome...");
        else
         System.out.println("Not Palindrome...");   */
        //  System.out.println(rcp1(n, 12, 9, 11));
        // subset(wrd, "", 0);
        // toi(3, 'A', 'B', 'C');
        // System.out.println(jos(7, 3));
       /*  System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        System.out.println();
        int []arr = new int[n];
        System.out.print("Enter element in an array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
        System.out.print("Enter sum = "); 
        int sum = sc.nextInt(); 
        System.out.println(subsetSum(arr, n,sum ));  */
        allPermutation(wrd, "");
    }
    static void printNto1(int n){
        if(n == 0)
          return;
        System.out.print(n+" ");
        printNto1(n-1);  
    }
    static void print1toN(int n){
        if(n == 0)
         return;
        print1toN(n-1);
        System.out.print(n+" ");
    }

    static void tailRecursion1toN(int n,int k){
        if(n == 0)
          return;
        System.out.print(k+" ");
        tailRecursion1toN(n-1, k+1);  
    }
    static int fact1(int n){
        if(n == 1)
         return n;
        return n*fact1(n-1); 
    }
    static int fact2(int n,int k){
        if(n == 1)
          return k;
        return fact2(n-1, k*n);  
    }
    static int nthFibbonacciNo(int n){
        if(n == 0 || n == 1)
          return n;
        else
          return nthFibbonacciNo(n-1)+nthFibbonacciNo(n-2);     
    }
    static int sum1toN1(int n){
        if(n == 1)
          return 1;
        return n+sum1toN1(n-1);  
    }
    static int sum1toN2(int n,int k){
        if(n == 1)
          return k;
        return sum1toN2(n-1, k+n);  
    }
    static boolean checkPalindrome(String wrd,int start,int end){
        if(start >= end)
          return true;
        return (wrd.charAt(start) == wrd.charAt(end) && checkPalindrome(wrd, start+1, end-1));  
    }
    static int sumOfDigit(int n){
        if(n <= 9)
          return n;
        return (n%10)+sumOfDigit(n/10);  
    }
    static int rcp(int n,int a,int b,int c){
        if(n == 0)
          return 1;
        else if(n < 0)
          return 0;
        else
          return rcp(n-a, a, b, c)+rcp(n-b, a, b, c)+rcp(n-c, a, b, c);    
    }
    static int rcp1(int n,int a,int b,int c){
        if(n == 0)
          return 0;
        if(n < 0)
          return -1;
        int res = Math.max(Math.max(rcp1(n-a, a, b, c), rcp1(n-b, a, b, c)),rcp1(n-c, a, b, c));
        if(res == -1)
            return 0;
        return res+1;
    }
    static void subset(String wrd,String currt,int i){
        if(i == wrd.length()){
            System.out.print(currt+" ");
            return;
        }
        subset(wrd, currt, i+1);
        subset(wrd, currt+wrd.charAt(i), i+1);
    }
    static void toi(int n,char A,char B,char C){
        if(n == 0)
          return;
        toi(n-1, A, C, B);
        System.out.println("Disc no "+n+" move from rod "+A+" to "+C);
        toi(n-1, B, A, C);  
    }
    static int jos(int n,int k){
        if(n == 1)
          return 0;

        return (jos(n-1,k)+k)%n;  
    }
    static int subsetSum(int []arr,int i,int sum){
        if(i == 0)
           return (sum == 0 ? 1 : 0);
        return subsetSum(arr, i-1, sum)+subsetSum(arr, i-1, sum-arr[i-1]);   
    }
    static void allPermutation(String ques,String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<ques.length();i++){
          char ch = ques.charAt(i);
          String newQues = ques.substring(0, i)+ques.substring(i+1);
          allPermutation(newQues, ans+ch);
        }
    }
}