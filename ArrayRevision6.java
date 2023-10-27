import java.util.*;
public class ArrayRevision6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        // System.out.println("Enter drgree of rotation = ");
        // int d = sc.nextInt();  
       /*  arr = leftRotation1(arr, d);
        System.out.println("Array after left rotation by d = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");  */
        //   leftRotation3(arr, d);
        leadersInArray2(arr);
    }
    static int[] leftRotation1(int []arr,int d){
        while(d>0){
            int temp = arr[0];
            for(int i=1;i<arr.length;i++)
               arr[i-1] = arr[i];
            arr[arr.length-1] = temp;
            d--;   
        }
        return arr;
    }
    static void leftRotation2(int []arr,int d){
        int []temp = new int[d];
        for(int i=0;i<d;i++)
           temp[i] = arr[i];
        for(int i=d;i<arr.length;i++)
           arr[i-d] = arr[i];
        for(int i=0;i<d;i++)
           arr[arr.length-d+i] = temp[i];
        System.out.println("Array after rotation = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");         
    }
    static void leftRotation3(int []arr,int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println("Array after rotating = ");
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
    static void leadersInArray1(int []arr){
        System.out.println("Leaders of array is = ");
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] <= arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag)
              System.out.print(arr[i]+" ");
        }
    }
    static void leadersInArray2(int []arr){
        System.out.println("Leaders in array = ");
        int currnt_leader = arr[arr.length-1];
        System.out.print(currnt_leader+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > currnt_leader){
                currnt_leader = arr[i];
                System.out.print(currnt_leader+" ");
            }
        }
    }
}
