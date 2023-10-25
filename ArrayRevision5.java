import java.util.*;
public class ArrayRevision5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
       /*  arr = moveZeros2(arr);
        System.out.println("Array after moving all zeros = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");   */
        arr = rotateLeft2(arr);
        System.out.println("Array after rotating left by one = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    static int[] moveZeros1(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        return arr;
    }
    static int[] moveZeros2(int []arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    static int[] rotateLeft1(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
    static int[] rotateLeft2(int []arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++)
            arr[i-1] = arr[i];
        arr[arr.length-1] = temp;
        return arr;    
    }
}
