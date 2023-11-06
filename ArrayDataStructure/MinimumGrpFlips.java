package ArrayDataStructure;
import java.util.*;
public class MinimumGrpFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        function2(arr);   
    }
    static void function1(int []arr){
        int count0 = 0,count1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)
              count0++;
            if(arr[i] == 1)
              count1++;  
        }
        if(count0 == arr.length || count1 == arr.length){
            System.out.println("All elements are same.... ");
            return;
        }
        if(count0 <= count1){
            int k = 0;
            for(int i=0;i<arr.length;i++){ 
                if(arr[i] == 0){
                    for(int j=i;j<arr.length;j++){
                        if(arr[j] == 0)
                           continue;
                        if(arr[j] == 1){
                            k = j;
                            break;   
                        }
                    }
                    System.out.println("From "+i+" to "+(k-1));
                    i = k;
                }
                
            }
        }
        if(count1 < count0){
            int k = 0;
            for(int i=0;i<arr.length;i++){ 
                if(arr[i] == 1){
                    for(int j=i;j<arr.length;j++){
                        if(arr[j] == 1)
                           continue;
                        if(arr[j] == 0){
                            k = j;
                            break;   
                        }
                    }
                    System.out.println("From "+i+" to "+(k-1));
                    i = k;
                } 
            }
        }
    }
    static void function2(int []arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0])
                   System.out.println("From "+i+" to ");
                else
                  System.out.println(i-1);   
            }
        }
        if(arr[arr.length-1] != arr[0])
          System.out.println(arr.length-1);
    }
}
