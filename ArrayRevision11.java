import java.util.*;
public class ArrayRevision11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        // System.out.println("Maximum profit = "+stocksBuyAndSell(arr, 1, 0));  
        // System.out.println("Maximum consicutive one = "+maxConsecutive1s2(arr));
        System.out.println("Maximum sum sub array = "+MaxSubArraySum2(arr));
    }
    static int stocksBuyAndSell(int []arr,int buy,int index){
        if(index == arr.length)
           return 0;
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-arr[index]+stocksBuyAndSell(arr, 0, index+1),0+stocksBuyAndSell(arr, 1, index+1));
        }   
        else{
            profit = Math.max(arr[index]+stocksBuyAndSell(arr, 1, index+1),0+stocksBuyAndSell(arr, 0, index+1));
        }
        return profit;
    }
    static int maxConsecutive1s1(int []arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                int count = 0;
                for(int j=i;j<arr.length && arr[j] == 1;j++)
                   count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
    static int maxConsecutive1s2(int []arr){
        int c = 0,max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                c++;
                max = Math.max(max, c);
            }
            else
              c = 0;
        }
        return max;
    }
    static int MaxSubArraySum1(int []arr){
        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            int currnt = 0;
            for(int j=i;j<arr.length;j++)
              currnt = currnt+arr[j];
            maxSum = Math.max(maxSum, currnt);  
        }
        return maxSum;
    }
    static int MaxSubArraySum2(int []arr){
        int max = arr[0],currnt = arr[0];
        for(int i=1;i<arr.length;i++){
            currnt = Math.max(arr[i], arr[i]+currnt);
            max = Math.max(max, currnt);
        }
        return max;
    }
}
