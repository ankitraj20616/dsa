import java.util.*;
public class ArrayRevision17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array = ");
        for(int i=0;i<arr.length;i++)
          arr[i] = sc.nextInt();
        // System.out.println("Majority elements is present at index = "+function2(arr));  
        // function4(arr);
    }
    //Majority element in array 
    static int function1(int []arr){
      for(int i=0;i<arr.length;i++){
        int count = 1;
        for(int j=i+1;j<arr.length;j++){
          if(arr[j] == arr[i])
            count++;
        }
        if(count > arr.length/2)
          return i;
      }
      return -1;
    }
    static int function2(int []arr){
      int res = 0,count = 1;
      for(int i=1;i<arr.length;i++){
        if(arr[i] == arr[res])
          count++;
        else
          count--;
        if(count == 0){
          count = 1;
          res = i;
        }    
      }
      int c = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] == arr[res])
          c++;
      }
      if(c > arr.length/2)
        return res;
      return -1;  
    }
    //Minimum grp flips to make same..
    static void function3(int []arr){
      int count0 = 0,count1 = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] == 0)
          count0++;
        if(arr[i] == 1)
          count1++;  
      }
      if(count1 >= count0){
        for(int i=0;i<arr.length;i++){
          if(arr[i] == 0){
            System.out.print("from "+i+" to ");
            for(int j=i+1;j<arr.length;j++){
              if(arr[j] == 1){
                System.out.print(j-1);
                i = j;
                break;
              }
            }
            System.out.println();
          }
        }
      }
      if(count1 < count0){
        for(int i=0;i<arr.length;i++){
          if(arr[i] == 1){
            System.out.print("from "+i+" to ");
            for(int j=i+1;j<arr.length;j++){
              if(arr[j] == 0){
                System.out.print(j-1);
                i = j;
                break;
              }
            }
            System.out.println();
          }
        }
      }
    }
  static void function4(int []arr){
    for(int i=1;i<arr.length;i++){
      if(arr[i] != arr[i-1]){
        if(arr[i] != arr[0])
          System.out.println("From "+i+" to ");
        if(arr[i] == arr[0])
          System.out.println(i-1);
      }
    }
    if(arr[arr.length - 1] != arr[0])
      System.out.println(arr.length-1);
  }
  
}
