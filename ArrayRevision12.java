import java.util.*;
public class ArrayRevision12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum length = "+maxLengethOddEven2(arr));
    }
    static int maxLengethOddEven1(int []arr){
        int max = 1;
        for(int i=0;i<arr.length-1;i++){
            int length = 1;
            for(int j=i;j<arr.length-1;j++){
                if((arr[j]%2==0 && arr[j+1]%2!=0) || (arr[j]%2!=0 && arr[j+1]%2==0)){
                   length++;
                   max = Math.max(max, length);
                }
                else 
                  break;   
            }
            
        }
        return max;
    }
    static int maxLengethOddEven2(int []arr){
        int max = 0,length = 0;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
                length++;
                max = Math.max(max, length);
            }
            else
               length = 0;
        }
        return max+1;
    }
}
