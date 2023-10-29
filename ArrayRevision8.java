import java.util.*;
public class ArrayRevision8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        System.out.println("Enter elements in an array = ");
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        System.out.println("Maximum profit = "+maximumProfit(arr, 0, n-1));  
    }
    static int maximumProfit(int []arr,int start,int end){
        if(start>=end)
           return 0;
        int profit = 0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int current_profit = (arr[j] - arr[i])+maximumProfit(arr, start, i-1)+maximumProfit(arr, j+1, end);
                    profit = Math.max(profit,current_profit);
                }
            }
        }
        return profit;
    }
}
