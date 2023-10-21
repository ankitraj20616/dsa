import java.util.*;
public class ArrayRivision2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
        // System.out.println(linearSearch(arr, 5));
        // insertion(arr, 7, 2);
        // deletion(arr, 3);
        // System.out.println("Largest element in array is = "+largestElement(arr));
        // System.out.println("Second largest element in array is = "+secondLargest1(arr));
        if(checkSorted2(arr))
          System.out.println("Yes!...Sorted..");
        else
          System.out.println("No!...not sorted...");  
    }
    static int linearSearch(int []arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
               return i;
        }
        return -1;
    }
    static void insertion(int []arr,int x,int index){
        int []res = new int[arr.length + 1];
        for(int i=0;i<index;i++)
          res[i] = arr[i];
        res[index] = x;
        for(int i=index+1;i<res.length;i++)
           res[i] = arr[i-1];
        System.out.println("Array after insertion is = ");
        for(int i=0;i<res.length;i++)
           System.out.print(res[i]+" ");     
    }
    static void deletion(int []arr,int index){
        int []res = new int[arr.length-1];
        for(int i=0,k=0;i<arr.length;i++){
            if(i == index)
              continue;
            res[k++] = arr[i];  
        }
        System.out.println("Array after deletion = ");
        for(int i=0;i<res.length;i++)
           System.out.print(res[i]+" ");
    }
    static int largestElement(int []arr){
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[res])
               res = i;
        }
        return res;
    }
    static int secondLargest(int []arr){
        int largest = largestElement(arr);
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
    static int secondLargest1(int []arr){
        int max = 0,secondMax = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[max]){
                secondMax = max;
                max = i;
            }
            else if(arr[i] < arr[max]){
                if(secondMax == -1)
                  secondMax = i;
                else if(arr[i] > arr[secondMax])
                  secondMax = i;  
            }
        }
        return secondMax;
    }
    static boolean checkSorted1(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[i])
                  return false;
            }
        }
        return true;
    }
    static boolean checkSorted2(int []arr){
        boolean res = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                res = false;
                break;
            }
        }
        return res;
    }
}
