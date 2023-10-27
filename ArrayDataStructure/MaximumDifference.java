package ArrayDataStructure;
import java.util.*;
public class MaximumDifference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elememts in array = ");
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        System.out.println("Maximum difference in array is = "+function3(arr));   
    }
    static int function1(int []arr){
        int res = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j] - arr[i]) > res)
                   res = arr[j] - arr[i];
            }
        }
        return res;
    }
    static int function2(int []arr){
        int res = arr[1] - arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
               res = Math.max(res, arr[j]-arr[i]);
        }
        return res;
    }
    static int function3(int []arr){
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for(int j=1;j<arr.length;j++){
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(arr[j], minValue);
        }
        return res;
    }
}
