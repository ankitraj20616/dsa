package ArrayDataStructure;
import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Number of units of water we can store = "+function2(arr));  
    }
    static int function1(int []arr){
        int res = 0;
        int max = Math.min(arr[0],arr[arr.length-1]);
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max)
              break;
            res = res + (max-arr[i]);  
        }
        return res;
    }
    static int function2(int []arr){
        int res = 0;
        int []lmax = new int[arr.length];
        int []rmax = new int[arr.length];
        lmax[0] = arr[0];
        for(int i=1;i<arr.length;i++)
           lmax[i] = Math.max(lmax[i-1], arr[i]);
        rmax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
          rmax[i] = Math.max(rmax[i+1], arr[i]);    
        for(int i=1;i<arr.length-1;i++)
          res = res+ (Math.min(lmax[i], rmax[i])-arr[i]);
        return res;       
    }
}
