package ArrayDataStructure;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
        arr = reverse1(arr);
        System.out.println("Array after reversing = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    static int[] reverse1(int []arr){
        for(int i=0;i<arr.length/2;i++){
            int k = 0,l = 1;
            k = arr[i];
            arr[i] = arr[arr.length-l];
            arr[arr.length-l] = k;
            l++;
        }
        return arr;
    }
}

