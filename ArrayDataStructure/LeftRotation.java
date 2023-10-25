package ArrayDataStructure;
import java.util.*;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Enter degree of left rotation = ");
        int d = sc.nextInt();
        arr = function3(arr, d);
        System.out.println("Array after left rotating by d = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");  

    }
    static int[] function1(int []arr,int d){
        while(d>0){
            int temp = arr[0];
            for(int i=1;i<arr.length;i++)
              arr[i-1] = arr[i];
            arr[arr.length-1] = temp;
            d--; 
        }
        return arr;
    }
    static int[] function2(int []arr,int d){
        int []temp = new int[d];
        for(int i=0;i<d;i++)
          temp[i] = arr[i];
        for(int i=d;i<arr.length;i++)
           arr[i-d] = arr[i];
        for(int i=0;i<d;i++)
          arr[arr.length-d+i] = temp[i];
        return arr;        
    }
    static int[] function3(int []arr,int d){
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    static void reverse(int []arr,int low,int high){
        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
