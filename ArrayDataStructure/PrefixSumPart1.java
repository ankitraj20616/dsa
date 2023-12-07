package ArrayDataStructure;
import java.util.*;
public class PrefixSumPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        // function1(arr);
        if(function5(arr))
           System.out.println("Yes! Equilibrium is present...");
        else
          System.out.println("No! Equilibrium is present...");   
    }
    //Apporach 1
    static int getSum1(int []arr,int l,int r){
        int sum = 0;
        for(int i=l;i<=r;i++)
          sum += arr[i];
        return sum;  
    }
    static void function1(int []arr){
        System.out.println("Solution of the queries = ");
        System.out.println(getSum1(arr, 0, 2));
        System.out.println(getSum1(arr, 1, 3));
        System.out.println(getSum1(arr, 2, 6));
    }
    //Apporach 2
    static int getSum2(int []preFixSum,int l,int r){
        if(l-1 < 0)
          return preFixSum[r];
        if(r == preFixSum.length)
          return -1;  
        return preFixSum[r] - preFixSum[l-1];
    }
    static void function2(int []arr){
        int []preFixSum = new int[arr.length];
        preFixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++)
          preFixSum[i] = preFixSum[i-1] + arr[i];
        System.out.println("Solution of queries = ");    
        System.out.println(getSum2(preFixSum, 0, 2));
        System.out.println(getSum2(preFixSum, 1, 3));
        System.out.println(getSum2(preFixSum, 2, 6));
    }
    //Question 2
    static boolean function3(int []arr){
      for(int i=0;i<arr.length;i++){
        int sumL = 0,sumR = 0;
        for(int j=0;j<i;j++)
          sumL += arr[j];
        for(int j=i+1;j<arr.length;j++)
          sumR += arr[j];
        if(sumL == sumR)    
          return true;
      }
      return false;
    } 
    static boolean function4(int []arr){
      int []preFixSum = new int[arr.length];
      preFixSum[0] = arr[0];
      for(int i=1;i<arr.length;i++)
        preFixSum[i] = preFixSum[i-1] + arr[i];
      //to check element at 0 index
      if(preFixSum[preFixSum.length-1] == preFixSum[0])
        return true;  
      for(int i=1;i<preFixSum.length;i++){
        if(preFixSum[i-1] == preFixSum[preFixSum.length-1] - preFixSum[i])
          return true;
      }
      return false;
    }
    static boolean function5(int []arr){
      int sum = 0;
      for(int i=0;i<arr.length;i++)
        sum += arr[i];
      if(arr[0] == sum)
        return true;   
      int currnt_sum = arr[0];  
      for(int i=1;i<arr.length;i++){
        currnt_sum += arr[i];
        if(sum - currnt_sum == currnt_sum - arr[i])
          return true;
      }    
      return false;
    }
}
