package ArrayDataStructure;
import java.util.*;
public class LeftRotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        arr = function2(arr);
        System.out.println("Array after rotating left by one = ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static int[] function1(int []arr){
       for(int i=0;i<arr.length - 1 ;i++){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
       }
       return arr;
    }
    static int[] function2(int []arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++)
           arr[i-1] = arr[i];
        arr[arr.length-1] = temp;
        return arr;   
    }
}
