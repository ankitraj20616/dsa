import java.util.*;
public class ArrayRevision4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
       /*  arr = reverseArray(arr);
        System.out.println("Array after reversing = ");
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");  */
       /*  arr =  removeDuplicates1(arr);
        System.out.println("Array after removing duplicates = ");
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");  */
        removeDuplicates2(arr);   
    }
    static int[] reverseArray(int []arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = 0, k = 1;
            temp = arr[i];
            arr[i] = arr[arr.length - k];
            arr[arr.length - k] = temp;
            k++;
        }
        return arr;
    }
    static int[] removeDuplicates1(int []arr){
        int []temp = new int[arr.length];
        temp[0] = arr[0];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(temp[k] != arr[i]){
                temp[k+1] = arr[i];
                k++;
            }
        }
        int []res = new int[k+1];
        for(int i=0;i<res.length;i++)
            res[i] = temp[i];
        return res;    
    }
    static void removeDuplicates2(int []arr){
        int j = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        System.out.println("Array after removing Duplicates = ");
        for(int i=0;i<=j;i++)
          System.out.print(arr[i]+" ");
    }
}
