import java.util.*;
public class ArrayRevision14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        // System.out.println("Majority Element = "+majorityElement2(arr)); 
        MinimumGrpFlips2(arr); 
    }
    static int majorityElement1(int []arr){
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] == arr[i])
                  count++;
            }
            if(count > (arr.length/2))
               return i;
        }
        return -1;
    }
    static int majorityElement2(int []arr){
        int res = 0,count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[res])
              count++;
            else
              count--;  
            if(count == 0){
                res = i;
                count = 1;
            } 
        }
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == arr[res])
               c++;
        }
        if(c > (arr.length/2))
          return res;
        return -1;  
    }
    static void MinimumGrpFlips1(int []arr){
        int count0 = 0,count1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)
              count0++;
            if(arr[i] == 1)
              count1++;  
        }
        if(count0 == arr.length || count1 == arr.length)
          return;
        if(count0 <= count1){
            int k = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 0){
                    for(int j=i;j<arr.length;j++){
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
        if(count0 > count1){
            int k = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 1){
                    for(int j=i;j<arr.length;j++){
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
    static void MinimumGrpFlips2(int []arr){
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[res])
                   System.out.println("From "+i+" to ");  
                else
                    System.out.println(i-1);    
            }
        }
        if(arr[arr.length-1] != arr[res])
          System.out.println(arr.length-1);
    }
}
