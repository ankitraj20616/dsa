import java.util.*;
public class ArrayRevision10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        // moveAllZero2(arr);  
        // leftRotate1(arr);
        // leftRotate3(arr, 3);
        // leadersInArray3(arr);
        // maximumDiff2(arr);
        // printFreq(arr);
        // System.out.println("Maximum profit = "+stockBuyAndSell2(arr));
        // System.out.println("Maximum profit = "+stockBuyAndSell3(arr, 1, 0));
        System.out.println("solution = "+trappingRainWater1(arr));
    }
    static void moveAllZero1(int []arr){
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
        System.out.println("Array after moving all zeros to end = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    static void moveAllZero2(int []arr){
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
                c++;
            }
        }
        System.out.println("Array after moving all zeros to the end = ");
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
    }
    static void leftRotate1(int []arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++)
          arr[i-1] = arr[i];
        arr[arr.length-1] = temp;
        System.out.println("Array after left rotating by one = ");
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");  
    }
    static void leftRotate2(int []arr,int d){
        int []temp = new int[d];
        for(int i=0;i<d;i++)
          temp[i] = arr[i];
        for(int i=d;i<arr.length;i++)
          arr[i-d] = arr[i];
        for(int i=0;i<d;i++)
          arr[arr.length-d+i] = temp[i];
        System.out.println("Array after left rotating by d = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");      
    }
    static void leftRotate3(int []arr,int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println("Array after rotating left by d = ");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    static void reverse(int []arr,int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leadersInArray1(int []arr){
        System.out.println("Leaders in array = ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] <= arr[j])
                   break;
                else if(j == arr.length-1)
                   System.out.print(arr[i]+" ");
            }
        }
    }
    static void leadersInArray2(int []arr){
        System.out.println("Leaders in array = ");
        for(int i=0;i<arr.length;i++){
            boolean res = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] >= arr[i])
                   res = false;
            }
            if(res)
              System.out.print(arr[i]+" ");
        }
    }
    static void leadersInArray3(int []arr){
        System.out.println("Leaders in array = ");
        int current_leader = arr[arr.length-1];
        System.out.print(current_leader+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > current_leader){
                current_leader = arr[i];
                System.out.print(current_leader+" ");
            }
        }
    }
    static void maximumDiff1(int []arr){
        int res = arr[1] - arr[0];
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(res < arr[j] - arr[i])
                  res = arr[j] - arr[i];
            }
        }
        System.out.println("Maximum difference = "+res);
    }
    static void maximumDiff2(int []arr){
        int currentMin = arr[0];
        int res = arr[1] - arr[0];
        for(int i=1;i<arr.length;i++){
            res = Math.max(res, arr[i] - currentMin); 
            currentMin = Math.min(currentMin, arr[i]);  
        }
        System.out.println("Maximum difference = "+res);
    }
    static void printFreq(int []arr){
        int i = 1,n = arr.length;
        int count = 1;
        while(i < n){
            while(i < n && arr[i] == arr[i-1]){
                count++;
                i++;
            }
            System.out.println(arr[i-1]+":- "+count);
            i++;
            count = 1;
        }
    }
    static int stockBuyAndSell1(int []arr,int start,int end){
        int profit = 0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int currentProfit = (arr[j] - arr[i]) + stockBuyAndSell1(arr, start, i-1) + stockBuyAndSell1(arr, j+1, end);
                    profit = Math.max(profit,currentProfit);
                }
            }
        }
        return profit;
    }
    static int stockBuyAndSell2(int []arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1])
              profit = profit + (arr[i]-arr[i-1]);
        }
        return profit;
    }
    static int stockBuyAndSell3(int []arr,int buy,int i){
        if(i == arr.length)
          return 0;
        int profit = 0;  
        if(buy == 1){
            profit = Math.max(-arr[i]+stockBuyAndSell3(arr, 0, i+1),0+stockBuyAndSell3(arr, 1, i+1));
        }  
        else{
            profit = Math.max(arr[i]+stockBuyAndSell3(arr, 1, i+1),0+stockBuyAndSell3(arr, 0, i+1));
        }
        return profit;
    }
    static int trappingRainWater(int []arr){
        int res = 0,lmax=0,rmax=0;
        for(int i=1;i<arr.length-1;i++){
            for(int j=0;j<i;j++)
              lmax = Math.max(lmax,arr[j]);
            for(int j=i+1;j<arr.length;j++)
              rmax = Math.max(rmax, arr[j]);
            res = res+(Math.min(rmax, lmax)-arr[i]);
        }
        return res;
    }
    static int trappingRainWater1(int []arr){
        int []lmax = new int[arr.length];
        int []rmax = new int[arr.length];
        int res = 0;
        lmax[0] = arr[0];
        for(int i=1;i<arr.length;i++)
           lmax[i] = Math.max(lmax[i-1],arr[i]);
        rmax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
           rmax[i] = Math.max(rmax[i+1], arr[i]);
        for(int i=1;i<arr.length-1;i++){
            res = res+(Math.min(lmax[i], rmax[i])-arr[i]);
        }   
        return res;
                
    }
}
