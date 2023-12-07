package ArrayDataStructure;
import java.util.*;
public class FirstM_N_BonacciNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of N = ");
    int n = sc.nextInt();
    System.out.println("Enter value of M = ");
    int m = sc.nextInt();
    function1(n,m);
  } 
  static void function1(int n,int m){
    int []res = new int[m];
    for(int i=0;i<n-1;i++)
      res[i] = 0;
    res[n-1] = 1;
    int sum = 0;
    for(int i=0;i<n;i++)
      sum += res[i];
    for(int i=n,k=0;i<res.length;i++){
        res[i] = sum;
        sum = sum + res[i] - res[k++];
    } 
    System.out.println("N-Bonacci numbers are = ");
    for(int i=0;i<res.length;i++)
      System.out.print(res[i]+" "); 
  }   
}
