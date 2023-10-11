import java.util.*;
public class BitMagicQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number = ");
        // int n = sc.nextInt();
       /*  System.out.println("Enter value of k = ");
        int k = sc.nextInt();
        if(KthSetBit2(n, k))
           System.out.println("Kth bit is set...");
        else
          System.out.println("Kth bit is not set...");   */
        // System.out.println("Total set bits = "+totalSetBits3(n));  
        // powerOfTwo2(n);
        // System.out.println("Total set bits till n = "+totalSetBitsTillN(n));
      /*  System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []ques = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<ques.length;i++)
            ques[i] = sc.nextInt();
        // System.out.println("Odd occouring number is = "+oddOccourance2(ques, n));    
        // System.out.println("Missing number = "+missingNo1(ques, n));
        int []res = twoOddOccouring2(ques, n);
        System.out.println("Two odd occouring numbers are = ");
        for(int i:res){
            System.out.print(i+" "); 
        }  */
        System.out.println("Enter your word = ");
        String wrd = sc.next();
        System.out.println("It's subsets are = ");
        printSubSet(wrd, wrd.length());

    }
    static boolean KthSetBit1(int n,int k){
        if((n & (1<<(k-1))) != 0)
          return true;
        else
          return false;  
    }
    static boolean KthSetBit2(int n,int k){
        if(((n>>(k-1)) & 1) != 0)
          return true;
        else
          return false;  
    }
    static int totalSetBits1(int n){
        int count = 0;
        while(n > 0){
           if((n & 1) != 0)
               count++;
            n = n>>1;   
        }
        return count;
    }
    static int totalSetBits2(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = (n & (n-1));
        }
        return count;
    }
    static int []table = new int[256];
    static void intialization(){
        for(int i=0;i<256;i++)
          table[i] = (i&1)+ table[i/2];
    }
    static int totalSetBits3(int n){
        intialization();
        int res = table[n & 0xff];
        n = n>>8;
        res = res + table[n & 0xff];
        n = n>>8;
        res = res + table[n & 0xff];
        n = n>>8;
        res = res + table[n & 0xff];
        return res;
    }
    static void powerOfTwo1(int n){
        for(int i=1;i<=n;i++){
            if((1<<i) == n){
                System.out.println("Yes!..It's power of two....");
                return;
            }
        }
        System.out.println("Not power of 2");
    }
    static void powerOfTwo2(int n){
        if((n & (n-1)) == 0)
          System.out.println("Yes!..It's power of two....");
        else
          System.out.println("No!...It's not a power of two....");  
    }
    static int oddOccourance1(int []ques,int n){
        for(int i=0;i<ques.length;i++){
            int count = 0;
            for(int j=0;j<ques.length;j++){
                if(ques[i] == ques[j])
                    count++;
            }
            if(count%2 != 0)
              return ques[i];
        }
        return 0;
    }
    static int oddOccourance2(int []ques,int n){
        int res = 0;
        for(int i=0;i<ques.length;i++)
          res = res^ques[i];
        return res;  
    }
    static int missingNo1(int []ques,int n){
        int res = 0;
        for(int i=1;i<=(n+1);i++)
          res = res ^ i;
        for(int i=0;i<ques.length;i++)
          res = res^ques[i];
        return res;    

    }
    static int totalSetBitsTillN(int n){
        int x = n-(1<<twoPower(n));
        if(n == 0 || n == 1)
          return n;
        int bit1 = x*(1<<(x-1));  
        int bit2 = n - (1<<x);
        return bit1+bit2+1+totalSetBitsTillN(bit2);
    }
    static int twoPower(int n){
       int i = 0;
       while((1<<i) <= n)
         i++;
       return i-1;
    }
    static int[] twoOddOccouring1(int []ques,int n){
        int []res = new int[2];
        int k = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j =0;j<ques.length;j++){
                if(ques[i] == ques[j])
                  count++;
            }
            if(count%2 != 0){
              res[k] = ques[i];
              k++;
            }
        }
        return res;
    }
    static int[] twoOddOccouring2(int []ques,int n){
        int xor = 0;
        for(int i=0;i<n;i++)
         xor = xor^ques[i];
        int rightSetBit = (xor & (~(xor-1)));
        int res1 = 0,res2 = 0;
        int []res = new int[2];
        for(int i=0;i<n;i++){
            if((rightSetBit & ques[i]) != 0)
              res1 = res1^ques[i];
            else
              res2 = res2^ques[i];  
        } 
        res[0] = res1;
        res[1] = res2;
        return res;
    }
    static void printSubSet(String wrd,int n){
        for(int i=0;i<(1<<n);i++){
            String res = "";
            for(int j=0;j<n;j++){
                if((i & (1<<j)) != 0)
                  res = res+wrd.charAt(j);
            }
            System.out.print(res+" ");
        }
    }
}