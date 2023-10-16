import java.util.*;
public class ArrayRevision1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
       /* System.out.print("Enter element to search in an array = ");
        int x = sc.nextInt();
        System.out.println("Element in array is at index no = "+linaerSearch(arr, n, x));  */
        System.out.print("Enter value to insert = ");
        int x = sc.nextInt();
        System.out.print("Enter index no for insertion = ");
        int index = sc.nextInt();
        int []res = insertion(arr, n, x, index);
        System.out.print("Array after insertion is = ");
        for(int i=0;i<res.length;i++)
          System.out.print(res[i]+" ");
    }
    static int linaerSearch(int []arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i] == x)
               return i;
        }
        return -1;
    }
    static int[] insertion(int []arr,int n,int x,int index){
        int []res = new int[n+1];
        for(int i=0;i<index;i++)
          res[i] = arr[i];
        res[index] = x;
        for(int i=index+1;i<res.length;i++)
           res[i] = arr[i-1];
        return res;     
    }
}
