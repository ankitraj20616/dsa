package ArrayDataStructure;
import java.util.*;
public class MaxConsecutive1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        System.out.println("Enter elements in an array = ");
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        System.out.println("Maximum consecutive 1's = "+function2(arr));
    }
    static int function1(int []arr){
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int count = 0;
                for(int j=i;j<arr.length && arr[j] != 0;j++){
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
    static int function2(int []arr){
        int maxCount = 0,count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else
              count = 0;
        }
        return maxCount;
    }
}
