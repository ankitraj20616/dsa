import java.util.*;
public class ArrayRevision9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
       /*  System.out.println("Enter element to search = ");
        int element = sc.nextInt();
        System.out.println("Element found at = "+linearSearch(arr, element));  */
        // insertion(arr, 12, 2);
        // deletion(arr, 2);
        // System.out.println("Largest element in array = "+largestElement(arr));
        // System.out.println("Second largest element in array is = "+secondLargest2(arr));
       /* if(checkSorted(arr))
           System.out.println("Yes!Sorted..");
        else 
          System.out.println("No!Not Sorted..");  */ 
          // reverseArray(arr);  
          // removeDuplicates2(arr);
          // moveAllZeros3(arr);
          // leftRotateByOne(arr);
          leftRotateByD2(arr, 2);
    }
    static int linearSearch(int []arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element)
              return i;
        }
        return -1;
    }
    static void insertion(int []arr,int element,int index){
        int []res = new int[arr.length + 1];
        for(int i=0;i<index;i++)
          res[i] = arr[i];
        res[index] = element;
        for(int i=index+1;i<res.length;i++)
           res[i] = arr[i-1];
        System.out.println("Array after insertion = ");
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
       int max = arr[0];
       for(int i=1;i<arr.length;i++){
          if(arr[i] > max)
            max = arr[i];
      }
      return max;
    }
    static int secondLargest1(int []arr){
        int max = largestElement(arr);
        int secMax = -1;
        for(int i=0;i<arr.length;i++){
          if(arr[i] == max)
            continue;
          if(arr[i]>secMax)
            secMax = arr[i];  
        }
        return secMax;
    }
    static int secondLargest2(int []arr){
      int max = arr[0],secMax = -1;
      for(int i=1;i<arr.length;i++){
        if(arr[i] > max){
          secMax = max;
          max = arr[i];
        }
        if(arr[i] < max){
          if(secMax == -1)
            secMax = arr[i];
          if(arr[i] > secMax)
             secMax = arr[i];  
        }
      }
      return secMax;
    }
    static boolean checkSorted(int []arr){
      for(int i=1;i<arr.length;i++){
        if(arr[i] < arr[i-1])
            return false;
      }
      return true;
    }
    static void reverseArray(int []arr){
      for(int i=0,k=1;i<arr.length/2;i++){
        int temp = arr[i];
        arr[i] = arr[arr.length-k];
        arr[arr.length-k] = temp;
        k++;
      }
      System.out.println("Array after reversing = ");
      for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
    }
    static void removeDuplicates1(int []arr){
      int []res = new int[arr.length];
      res[0] = arr[0];
      int k=1;
      for(int i=1;i<arr.length;i++){
        if(arr[i] != res[k-1])
            res[k++] = arr[i];
          
      }
      System.out.println("Array after removing all duplicates = ");
      for(int i=0;i<k;i++)
        System.out.print(res[i]+" ");
    }
    static void removeDuplicates2(int []arr){
      int j=0;
      for(int i=1;i<arr.length;i++){
        if(arr[i] != arr[j]){
          arr[j+1] = arr[i];
          j++;
        }
      }
      System.out.println("Array after removing duplicates = ");
      for(int i=0;i<=j;i++)
         System.out.print(arr[i]+" ");
    }
    static void moveAllZeros1(int []arr){
      int []temp = new int[arr.length];
      int j = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] == 0)
          continue;
        temp[j++] = arr[i];  
      }
      System.out.println("Array after moving all zeros = ");
      for(int i=0;i<arr.length;i++)
        System.out.print(temp[i]+" ");
    }
    static void moveAllZeros2(int []arr){
      for(int i=0;i<arr.length;i++){
        if(arr[i] == 0){
          for(int j=i+1;j<arr.length;j++){
            if(arr[j] != 0){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
            }
          }
        }
      }
      System.out.println("Array after moving all zeros = ");
      for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
    }
    static void moveAllZeros3(int []arr){
      int c = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] != 0){
          int temp = arr[i];
          arr[i] = arr[c];
          arr[c] = temp;
          c++;
        }
      }
      System.out.println("Array after moving all zeros = ");
      for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    static void leftRotateByOne(int []arr){
      int temp = arr[0];
      for(int i=1;i<arr.length;i++)
        arr[i-1] = arr[i];
      arr[arr.length-1] = temp;
      System.out.println("Array after left rotating by one = ");
      for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");  
    }
    static void leftRotateByD1(int []arr,int d){
      int []temp = new int[d];
      for(int i=0;i<d;i++)
        temp[i] = arr[i];
      for(int i=d;i<arr.length;i++)
        arr[i-d] = arr[i];
      for(int i=0;i<temp.length;i++)
        arr[arr.length - d + i]  = temp[i];
      System.out.println("Array after rotating left by D = ");
      for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");    
    }
    static void leftRotateByD2(int []arr,int d){
      reverse(arr, 0, d-1);
      reverse(arr, d, arr.length-1);
      reverse(arr, 0, arr.length-1);
      System.out.println("Array after left rotation by D = ");
      for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    static void reverse(int []arr,int start,int end){
      while(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
}
