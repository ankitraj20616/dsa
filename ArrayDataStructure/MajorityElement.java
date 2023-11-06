package ArrayDataStructure;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        System.out.println("Majority element is at index = "+function1(arr));   

    }
    static int function1(int []arr){
        int n = arr.length/2;
        int res = -1;
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                  count++;
            }
            if(count > n)
              res = i;
        }
        return res;
    }
    static int function2(int []arr){
        int res = 0,count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[res] == arr[i])
               count++;
            else
               count--;
            if(count == 0){
                res = i;
                count = 1;
            }   
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == arr[res])
              count++;
            if(count <= arr.length/2)
              res = -1;  
        }
        return res;
    }
}
