package ArrayDataStructure;
import java.util.*;
public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array = ");
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        function1(arr);  
    }
    static void function1(int []arr){
       int n = arr.length;
       int i = 1,feq = 1;
       while(i<n){
          while(i<n && arr[i-1] == arr[i]){
            i++;
            feq++;
          }
          System.out.println(arr[i-1]+":- "+feq);
          i++;
          feq = 1;
       }
       if(n == 1 || arr[n-1] != arr[n-2])
         System.out.println(arr[n-1]+":- "+1);
    }
}
