import java.util.*;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b =");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF of a and b is = "+optimizedEuclidean(a, b));

    }
    static int count(int a,int b){
        int hcf = Math.min(a, b);
        while(hcf>0){
        if(a%hcf == 0 && b%hcf == 0)
           break;
        hcf--;
        }
        return hcf;
    }
    static int euclideanHCF(int a,int b){
        while(a!=b){
            if(a>b)
             a = a-b;
            else 
             b = b-a;   
        }
        return a;
    }
    static int optimizedEuclidean(int a,int b){
        if(b == 0)
         return a;
        return optimizedEuclidean(b, a%b); 
    }
}
