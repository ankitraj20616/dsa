package Revision_from_start1;
import java.util.*;
public class BitMagicRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter a number = ");
        //  int num = sc.nextInt();
        // System.out.println("Enter value of K = ");
        // int k = sc.nextInt();
        // checkKthSetBit2(num, k);
        // System.out.println("Number of set bits = "+countSetBits2(num));
        // powerOfTwo2(num);
       /*  System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();  */
        // System.out.println("Only Odd occurring number in array = "+onlyOddOccurring2(arr));  
        // System.out.println("One missing number in an array = "+missingOne(arr));  
        // System.out.println(totalSetFrom1ToN(num));
        // twoOddOccurring3(arr);
        System.out.println("Enter your String = ");
        String str = sc.next();
        powerSet(str);
    }
    static void checkKthSetBit1(int num,int k){
        if((num & (1<<(k-1))) != 0)
          System.out.println("K'th position is set...");
        else
          System.out.println("K'th position is not set...");  
    }
    static void checkKthSetBit2(int num,int k){
        if(((num>>(k-1)) & 1) != 0)
           System.out.println("K'th position is set...");
        else
          System.out.println("K'th position is not set..."); 
    }
    static int countSetBits1(int num){
        int count = 0;
        while (num>0) {
            if((num & 1) != 0)
              count++;
            num = num>>1;  
        }
        return count;
    }
    static int countSetBits2(int num){
        int count = 1;
        while (num>0) {
            if((num & (num-1)) != 0)
              count++;
            num = (num & (num-1)); 
        }
        return count;
    }
    static void powerOfTwo1(int num){
        int count = 1;
        while (num>0) {
            if((num & (num-1)) != 0)
              count++;
            num = num & (num-1);  
        }
        if(count>1)
          System.out.println("Not power of 2....");
        else
          System.out.println("Power of 2...");  
    }
    static void powerOfTwo2(int num){
        if((num & (num-1)) == 0)
          System.out.println("Power of 2...");
        else
          System.out.println("Not power of 2....");  
    }
    static int onlyOddOccurring1(int []arr){
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j])
                  count++;
            }
            if(count%2 != 0)
              return arr[i];
        }
        return -1;
    }
    static int onlyOddOccurring2(int []arr){
        int res = 0;
        for(int i=0;i<arr.length;i++)
          res = res^arr[i];
        return res;   
    }
    static int missingOne(int []arr){
        int res1 = 0,res2 = 0;
        for(int i=1;i<=arr.length+1;i++)
           res1 = res1^i;
        for(int i=0;i<arr.length;i++)
          res2 = res2^arr[i];
        return res1^res2;     
    }
    static int totalSetFrom1ToN(int num){
        if(num == 0 || num == 1)
          return num;
        int x = 0,j = num;
        while (j>0) {
            if((j & (j-1)) == 0){
                x = j;
                break;
            }
            j--;
        }
        int pow = 0;
        while (x>1) {
            pow++;
            x = x>>1;
        }
        int bit1 = (1<<(pow-1))*pow;
        int bit2 = (num-(1<<pow));
        return bit1+bit2+1+totalSetFrom1ToN(bit2);
    }
    static void twoOddOccurring1(int []arr){
        System.out.println("Two odd occurring numbers in array = ");
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j])
                  count++;
            }
            if(count%2 != 0)
              System.out.print(arr[i]+" ");
        }
    }
    static void twoOddOccurring2(int []arr){
        System.out.println("Two odd occurring numbers in array = ");
        int []res1 = new int[arr.length];
        int []res2 = new int[arr.length];
        int j = 0,k = 0;
        for(int i=0;i<arr.length;i++){
            if((1 & arr[i]) != 0){
                res1[j++] = arr[i];
            }
            else{
                res2[k++] = arr[i];
            }
        }
        int ans1 = 0,ans2 = 0;
        for(int i=0;i<res1.length;i++)
            ans1 = ans1^res1[i];
        for(int i=0;i<res2.length;i++)
           ans2 = ans2^res2[i];
        System.out.print(ans1+" ,"+ans2);       
    }
    static void twoOddOccurring3(int []arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++)
          xor = xor^arr[i];
        int sn = xor & (~(xor-1));
        int res1 = 0,res2 = 0;
        for(int i=0;i<arr.length;i++){
            if((sn & arr[i]) != 0)
              res1 = res1^arr[i];
            else
              res2 = res2^arr[i];  
        }  
        System.out.println("Two odd occurring numbers are = "+res1+" "+res2);
    }
    static void powerSet(String str){
        int n = 1<<(str.length());
        for(int i=0;i<n;i++){
            for(int j=0;j<str.length();j++){
                if((i & (1<<j)) != 0)
                  System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
