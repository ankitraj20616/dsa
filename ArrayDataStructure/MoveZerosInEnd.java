package ArrayDataStructure;
import java.util.*;
public class MoveZerosInEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Array after shifting all zeros = ");
        arr = function3(arr);
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    static int[] function1(int []arr){
        int []temp = new int[arr.length];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0)
                temp[k++] = arr[i];
        }
        return temp;
    }
    static int[] function2(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j=i+1;j<arr.length;j++){
                    int temp = 0;
                    if(arr[j] != 0){
                       temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                       break;
                    }
                }
            }
        }
        return arr;
    }
    static int[] function3(int []arr){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;

            }
        }
        return arr;
    }
}
