import java.util.*;

import ArrayDataStructure.maxEvenOddSubArray;
public class ArrayRevision13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        // System.out.println(maxEvenOddSubArray(arr));  
        System.out.println("Maximum Circular subArray sum = "+maxCircularSubArraySum3(arr));
    }
    static int maxEvenOddSubArray(int []arr){
        int count = 1,maxCount = 1;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]%2== 0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
              count++;
              maxCount = Math.max(maxCount, count);
            }
            else
              count = 1;
        }
        return maxCount;
    }
    static int maxCircularSubArraySum1(int []arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            int currnt_sum = arr[i];
            int currnt_max = arr[i];
            for(int j=1;j<arr.length;j++){
                int index = (i+j)%arr.length;
                currnt_sum += arr[index];
                currnt_max = Math.max(currnt_max,currnt_sum);
            }
            res = Math.max(res,currnt_max);
        }
        return res;
    }
    static int maxCircularSubArraySum2(int []arr){
        int max_normal = arr[0],currentSum1 = arr[0];
        int min_normal = arr[0],currentSum2 = arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum1 = Math.max(arr[i], arr[i]+currentSum1);
            currentSum2 = Math.min(arr[i], arr[i]+currentSum2);
            max_normal = Math.max(max_normal, currentSum1);
            min_normal = Math.min(min_normal, currentSum2);
        }
        if(max_normal < 0)
          return max_normal;
        int sum = arr[0];
        for(int i=1;i<arr.length;i++)
           sum += arr[i];
        int circular_max = sum - min_normal;
        return Math.max(max_normal, circular_max);  
    }
    static int subArraySum(int []arr){
        int max_normal = arr[0],currentSum1 = arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum1 = Math.max(arr[i], arr[i]+currentSum1);
            max_normal = Math.max(max_normal, currentSum1);
        }
        return max_normal;
    }
    static int maxCircularSubArraySum3(int []arr){
        int max_normal = subArraySum(arr);
        if(max_normal < 0)
          return max_normal;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            arr[i] = -1*arr[i];
        }  
        int max_circular = sum + subArraySum(arr);
        return Math.max(max_circular,max_normal);
    }
}
