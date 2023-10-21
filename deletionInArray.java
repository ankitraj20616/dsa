import java.util.Scanner;
public class deletionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter element in array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
        System.out.print("Enter index no of element to delete in array = ");
        int index = sc.nextInt();  
        int []res = deleteElement(arr, n, index);
        System.out.println("Array after deletion = ");
        for(int i=0;i<res.length;i++)
          System.out.print(res[i]+" ");
    }
    static int[] deleteElement(int []arr,int n,int index){
        if(arr == null || index < 0 || index >=n)
          return arr;
        int []res = new int[n-1];
        for(int i=0,k=0;i<arr.length;i++){
            if(i == index)
              continue;
            res[k++] = arr[i]; 
        }    
        return res;
    }
}

