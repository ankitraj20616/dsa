import java.util.*;
public class ArrayRevision16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Enter value of k = ");
        int k = sc.nextInt();  
        // System.out.println("Maximum sum of k cosicutive subarray = "+function1(arr, k));
        if(function3(arr, k))
           System.out.println("Yes!");
        else
          System.out.println("No!");   
    }
    //Question1 of window sliding technique
    static int function1(int []arr,int k){
        int sum = 0;
        for(int i=0;i<k;i++)
           sum += arr[i];
        int res = sum;
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            if(sum > res)
              res = sum;
        }
        return res;
    }
    //Question2 of window sliding technique
    static boolean function2(int []arr,int sum){
        for(int i=0;i<arr.length;i++){
            int currnt_sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                currnt_sum += arr[j];
                if(currnt_sum == sum)
                   return true;
            }
        }
        return false;
    }
    static boolean function3(int []arr,int sum){
        int currnt_sum = 0;
        for(int i=0,k=0;i<arr.length;i++){
            if(currnt_sum < sum)
              currnt_sum += arr[i];
            if(currnt_sum > sum)
                currnt_sum -= arr[k++];
            if(currnt_sum == sum)
              return true; 
        }
        return false;
    }
    //Question3 of window sliding technique
}
