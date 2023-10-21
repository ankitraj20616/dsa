package ArrayDataStructure;
import java.util.*;
public class RemoveDuplictes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt(); 
        findDuplicate2(arr);  
    }
    static void findDuplicate(int []arr){
        int []temp = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;
        for(int i=1;i<arr.length;i++){
            if(temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        System.out.println("Array after removing duplicates = ");
        for(int i=0;i<res;i++)
          System.out.print(temp[i]+" ");
    }
    static void findDuplicate1(int []arr){
        int res = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        System.out.println("Array after removing duplicates = ");
        for(int i=0;i<res;i++)
          System.out.print(arr[i]+" ");
    }
    static void findDuplicate2(int []arr){
        int i=0,j=1;
        while(j<arr.length){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
            j++;
        }
        System.out.println("Array after removing all duplicates = ");
        for(int k=0;k<=i;k++)
          System.out.print(arr[k]+" ");
    }
}
