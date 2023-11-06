package ArrayDataStructure;
import java.util.*;
public class maxCircularSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("ENter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Maximum sum of circular subArray = "+function3(arr));
    }
    static int function1(int []arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            int currnt_sum = arr[i];
            int currnt_max = arr[i];
            for(int j=1;j<arr.length;j++){
                int index = (i+j)%arr.length;
                currnt_sum += arr[index];
                currnt_max = Math.max(currnt_max, currnt_sum);
            }
            res = Math.max(currnt_max, res);
        }
        return res;
    }
    static int function2(int []arr){
        int maxSum = arr[0],currntSum1 = arr[0];
        for(int i=1;i<arr.length;i++){
           currntSum1 = Math.max(arr[i], arr[i]+currntSum1);
           maxSum = Math.max(maxSum, currntSum1);
        }
        if(maxSum < 0)
          return maxSum;
        int minSum = arr[0],currntSum2 = arr[0];
        for(int i=1;i<arr.length;i++){
            currntSum2 = Math.min(arr[i], arr[i]+currntSum2);
            minSum = Math.min(minSum, currntSum2);
        }
        int sum = arr[0];
        for(int i=1;i<arr.length;i++)
          sum += arr[i];
        int maxOfCircular = sum - minSum;
        return Math.max(maxSum, maxOfCircular);
    }
    static int maxSumOfSubArray(int []arr){
        int maxSum = arr[0],currntSum1 = arr[0];
        for(int i=1;i<arr.length;i++){
           currntSum1 = Math.max(arr[i], arr[i]+currntSum1);
           maxSum = Math.max(maxSum, currntSum1);
        }
        return maxSum;
    }
    static int function3(int []arr){
        int normal_max = maxSumOfSubArray(arr);
        if(normal_max < 0)
          return normal_max;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            arr[i] = -1*arr[i];
        }  
        int maxOfCircular = sum + maxSumOfSubArray(arr);
        return Math.max(normal_max, maxOfCircular);
    }
}
