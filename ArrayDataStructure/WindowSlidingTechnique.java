package ArrayDataStructure;
import java.util.*;
public class WindowSlidingTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Enter value of K = ");
        int k = sc.nextInt();  
        // System.out.println("Maximum sum of K consecutive element = "+function2(arr, k));
        if(function4(arr, k))
          System.out.println("Yes!");
        else
          System.out.println("No!");  
    }
    //Question1
    static int function1(int []arr,int k){
        int res = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int current_sum = 0;
            for(int j=1,x=i;j<=k && x<arr.length;j++)
                current_sum += arr[x++];
            res = Math.max(res, current_sum);   
        }
        return res;
    }
    static int function2(int []arr,int k){
        int current_sum = 0;
        for(int i=0;i<k;i++)
          current_sum += arr[i];
        int res = current_sum;
        for(int i=k;i<arr.length;i++){
            current_sum = (current_sum + arr[i]) - arr[i-k];
            res = Math.max(res,current_sum);
        }
        return res;
    }
    //Question2
    static boolean function3(int []arr,int sum){
        for(int i=0;i<arr.length;i++){
            int current_sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                current_sum += arr[j];
                if(current_sum == sum)
                   return true; 
            }
        }
        return false;
    }
    static boolean function4(int []arr,int sum){
        int current_sum = 0;
        for(int i=0,j=0;i<arr.length;i++){
            if(current_sum < sum)
              current_sum += arr[i];
            if(current_sum > sum){
                current_sum -= arr[j];
                j++;
            }
            if(current_sum == sum)
              return true;
        }
        return false;
    }
}
