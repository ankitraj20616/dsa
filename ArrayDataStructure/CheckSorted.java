package ArrayDataStructure;
import java.util.*;
public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        if(checkSorting1(arr))
          System.out.println("Yes!..Sorted");
        else
          System.out.println("No!..Not Soreted");  
    }
    static boolean checkSorting1(int []arr){
        boolean res = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
              res = false;
              break;
            }
        }
        return res;
    }
}
