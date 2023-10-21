package ArrayDataStructure;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        System.out.println("Enter elements in an array = ");
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        int firstMaxIndex = maxElement(arr);
        int []newArr = deleteElement(arr,firstMaxIndex);
        int secondMax = maxElement(newArr);
        System.out.println("Index of Second maximum element in array is = "+secondMax2(arr));   

    }
    static int maxElement(int []arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[res])
              res = i;
        }
        return res;
    }
    static int[] deleteElement(int []arr,int index){
        int []res = new int[arr.length-1];
        for(int i=0,k=0;i<arr.length;i++){
            if(i == index)
              continue;
            res[k++] = arr[i];  
        }
        return res;
    }
    static int secondMax(int []arr){
        int largest = maxElement(arr);
        int res = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[largest]){
                if(res == -1)
                  res = i;
                else if(arr[i] > arr[res])
                  res = i;  
            }
        }
        return res;
    }
    static int secondMax2(int []arr){
        int max = 0,secondMax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[max]){
                secondMax = max;
                max = i;
            }
            else if(arr[i] != arr[max]){
                if(secondMax == -1 || arr[i] > arr[secondMax])
                  secondMax = i;
            }
        }
        return secondMax;
    }
}
