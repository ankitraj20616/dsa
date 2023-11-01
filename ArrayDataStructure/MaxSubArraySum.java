package ArrayDataStructure;
import java.util.*;
public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Maximum sum of subarray = "+function2(arr));  
    }
    static int function1(int []arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++)
               sum = sum + arr[j];
            max = Math.max(max, sum);   
        }
        return max;
    }
    static int function2(int []arr){
        int max = arr[0],sum = arr[0]; //currnt = arr[0]
        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i],arr[i]+sum);
            // currnt = sum;
            max = Math.max(max, sum);
        }
        return max;
    }
}
