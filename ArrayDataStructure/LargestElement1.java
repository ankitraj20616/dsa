package ArrayDataStructure;
import java.util.*;
public class LargestElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array = ");
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Maximum number in array is present at index no = "+maxInArray1(arr));
    }
    static int maxInArray1(int []arr){
        int res = 0,index = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i] > res){
              res = arr[i];
              index = i;
           }
        }
        return index;
    }
}
