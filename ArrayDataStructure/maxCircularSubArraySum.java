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
        System.out.println("Maximum sum of circular subArray = "+function1(arr));
    }
   /* 
        for(int i=1;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j != j-1;j++){
                if(j == arr.length)
                  j = 0;
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);  
            }
        }
        return maxSum;
    } */
    static int function1(int []arr){
        int maxSum = subArraySum(arr);
        for(int i=1;i<arr.length;i++){
            leftRotateBy1(arr);
            maxSum = Math.max(maxSum, subArraySum(arr));
        }
        return maxSum;
    }
    static int subArraySum(int []arr){
        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    static void leftRotateBy1(int []arr){
        int temp = arr[arr.length-1];
        for(int i=0;i<arr.length-2;i++)
          arr[i+1] = arr[i];
        arr[0] = temp;  
    }

}
