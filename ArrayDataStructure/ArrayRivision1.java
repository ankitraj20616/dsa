package ArrayDataStructure;
import java.util.*;
public class ArrayRivision1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        System.out.println("Enter elements in an array = ");
        int []arr = new int[n];
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
       /*  System.out.println("Enter elements to search = ");
        int x = sc.nextInt();  
        System.out.println("Element is present at index no = "+linearSearch(arr, x)); */
       /* System.out.println("Enter element to insert in array = ");
        int x = sc.nextInt();
        System.out.println("Enter index number for insertion = ");
        int index = sc.nextInt(); */ 
       /*  System.out.println("Enter index number to delete =");
        int index = sc.nextInt();
        int []res = deletion(arr, index);
        System.out.println("Array after deletion = ");
        for(int i=0;i<res.length;i++)
          System.out.print(res[i]+" "); */
        System.out.println("Maximum nuber in array is = "+maxElement2(arr));  
    }
    static int linearSearch(int []arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
              return i;
        }
        return -1;
    }
    static int[] insertion(int []arr,int x,int index){
        int []res = new int[arr.length+1];
        for(int i=0;i<index;i++)
          res[i] = arr[i];
        res[index] = x;
        for(int i=index+1;i<res.length;i++)
           res[i] = arr[i-1];
        return res;     
    }
    static int[] deletion(int []arr,int index){
      int []res = new int[arr.length-1];
      for(int i=0,k=0;i<arr.length;i++){
        if(i==index)
          continue;
        res[k++] = arr[i];  
      }
      return res;
    }
    static int maxElement1(int []arr){
      for(int i=0;i<arr.length;i++){
        boolean flag = true;
        for(int j=0;j<arr.length;j++){
          if(arr[j] > arr[i])
            flag = false;
        }
        if(flag)
          return i;
      }
      return -1;
    }
    static int maxElement2(int []arr){
      int res = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] > arr[res]){
          res = i;
        }
      }
      return res;
    }
}
