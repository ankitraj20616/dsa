package ArrayDataStructure;
import java.util.*;
public class StockBuySell1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array = ");
      int n = sc.nextInt();
      int []arr = new int[n];
      System.out.println("Enter elements in array = ");
      for(int i=0;i<arr.length;i++)
         arr[i] = sc.nextInt();
    //    System.out.println("Maximum profit = "+function2(arr, 1, 0));  
    System.out.println("Maximum profit = "+function3(arr));
   } 
   static int function1(int []arr,int start,int end){
        if(end <= start)
          return 0;
        int profit = 0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int current_profit = (arr[j] - arr[i])+function1(arr, start,i-1)+function1(arr, j+1, end);
                    profit = Math.max(profit, current_profit);
                }
            }
        }
        return profit;
   }
   static int function2(int []arr,int buy,int i){
        if(i == arr.length)
           return 0;
        int profit = 0;   
        if(buy == 1){
            profit = Math.max((-arr[i]+function2(arr, 0, i+1)),(0+function2(arr, 1, i+1)));
        }
        else
           profit = Math.max((arr[i]+function2(arr, 1, i+1)),(0+function2(arr, 0, i+1)));
        return profit;   
   }
   static int function3(int []arr){
       int profit = 0;
       for(int i=1;i<arr.length;i++){
        if(arr[i] > arr[i-1])
          profit = profit + (arr[i] - arr[i-1]);
       }
       return profit;
   }
}
