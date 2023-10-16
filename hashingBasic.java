import java.util.*;
public class hashingBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        System.out.print("Enter maximum element stored in an array = ");
        int max = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in an array = ");
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
        int [] hash = new int[max+1];
        Arrays.fill(hash,0);
        for(int i=0;i<n;i++)
            hash[arr[i]] += 1;
        System.out.print("Enter number of queries = ");   
        int q = sc.nextInt();
        while(q>0){
            System.out.print("Enter a number = ");
            int num = sc.nextInt();
            System.out.println("Number appears = "+hash[num]+" times");
            q--;
        } 
    }
}
