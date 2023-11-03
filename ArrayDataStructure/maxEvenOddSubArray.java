package ArrayDataStructure;
import java.util.*;
public class maxEvenOddSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        System.out.println("Maximum length = "+function1(arr));   
    }
    static int function1(int []arr){
        int length = 0,maxLength = 0;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
               length++;
               maxLength = Math.max(maxLength, length);
            }
            else
              length = 0;
        }
        return maxLength+1;
    }
    static int function2(int []arr){
        int maxLength = 1;
        for(int i=0;i<arr.length-1;i++){
            int length = 1;
            for(int j=i;j<arr.length-1;j++){
                if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
                   length++;
                   maxLength = Math.max(maxLength, length);
                }
                else
                   break;
            }
        }
        return maxLength;
    }
   
}
