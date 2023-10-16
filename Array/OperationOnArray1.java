package Array;
import java.util.*;
public class OperationOnArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter element in an array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
       System.out.print("Enter value to search = ");
        int x = sc.nextInt();
        System.out.println("Entered value is at "+search(arr, n, x)+" position in array");  
        
    }
    static int search(int []arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i] == x)
              return i;
        }
        return -1;
    }
    static int[] insert(int []arr,int n,int x,int pos,int cap){
        if(n == cap)
          return arr;
        for(int i=n-1;i>=(pos-1);i--){
            arr[i+1] = arr[i];
        }  
        arr[pos-1] = x;
        return arr;
    }
}
