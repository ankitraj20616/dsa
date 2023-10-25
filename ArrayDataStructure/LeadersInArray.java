package ArrayDataStructure;
import java.util.*;
public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
      /* ArrayList<Integer> res= function1(arr);  
        System.out.println("Leaders of an array is = ");
        for(int i=0;i<res.size();i++)
          System.out.print(res.get(i)+"  ");   */ 
        function3(arr);  
    }
    static ArrayList<Integer> function1(int []arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] <= arr[j])
                  break;
                else if(j == arr.length-1)
                   res.add(arr[i]);  
            }

        }
        res.add(arr[arr.length - 1]);
        return res;
    }
    static void function2(int []arr){
        System.out.println("Leaders in an array = ");
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] <= arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag)
              System.out.print(arr[i]+" ");
        }
    }
    static void function3(int []arr){
        System.out.println("Leaders of an array = ");
        int current_leader = arr[arr.length - 1];
        System.out.print(current_leader+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(current_leader < arr[i]){
                current_leader = arr[i];
                System.out.print(current_leader+" ");
            }
        }
    }
}
