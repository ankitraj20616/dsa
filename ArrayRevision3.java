import java.util.*;
public class ArrayRevision3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
          
        // arr = reverseArray(arr);
        // System.out.println("Array after reversing = ");
        // for(int i=0;i<arr.length;i++)
        //    System.out.print(arr[i]+" ");

        removeDuplicates2(arr);
    }
    static int[] reverseArray(int []arr){
        int j = 1;
        for(int i=0;i<arr.length/2;i++){
            int k = arr[i];
            arr[i] = arr[arr.length - j];
            arr[arr.length - j] = k;
            j++;
        }
        return arr;
    }
    static void removeDuplicates1(int []arr){
        int []temp = new int[arr.length];
        int res = 1;
        temp[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp[res - 1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        System.out.println("Array after removing all it's duplicate = ");
        for(int i=0;i<res;i++)
          System.out.print(temp[i]+" ");
    }
    static void removeDuplicates2(int []arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("Array after removing all duplicates = ");
        for(int k=0;k<=i;k++)
           System.out.print(arr[k]+" ");
    }
}
