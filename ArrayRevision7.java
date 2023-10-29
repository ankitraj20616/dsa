import java.util.*;
public class ArrayRevision7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        // System.out.println("Maximum difference in an array is = "+maximumDifference2(arr));   
        printFrequencies(arr);
    }
    static int maximumDifference1(int []arr){
        int res = arr[1] - arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] - arr[i] > res)
                  res = arr[j] - arr[i];
            }
        }
        return res;
    }
    static int maximumDifference2(int []arr){
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for(int i=1;i<arr.length;i++){
            res = Math.max(res, arr[i]-minValue);
            minValue = Math.min(arr[i], minValue);
        }
        return res;
    }
    static void printFrequencies(int []arr){
        int i = 1,feq = 1,n = arr.length;
        while(i<n){
            while(i<n && arr[i-1] == arr[i]){
                feq++;
                i++;
            }
            System.out.println(arr[i-1]+":- "+feq);
            i++;
            feq = 1;
        }
        if(n == 1 || arr[n-1] != arr[n-2])
          System.out.println(arr[n-1]+":- "+1);
    }
}
