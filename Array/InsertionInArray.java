package Array;
import java.util.*;
public class InsertionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i = 0;i<n;i++)
           arr[i] = sc.nextInt();
        System.out.println("Enter an element to be inserted in an array = ");
        int x = sc.nextInt();
        System.out.println("Enter index no of insertion = ");
        int index = sc.nextInt();
        insertion(arr, n, x, index);
        
    }
    static void insertion(int []arr,int n,int x,int index){
        int []res = new int[n+1];
        for(int i=0;i<index;i++)
          res[i] = arr[i];
        res[index] = x;  
        for(int i=index+1;i<n+1;i++)
            res[i] = arr[i-1];
        System.out.println("Array after insertion = ");
        for(int i=0;i<res.length;i++)
          System.out.print(res[i]+" ");    
    }
}
