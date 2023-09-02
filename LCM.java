import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM of a and b is = "+lcm1(a, b));
        System.out.println("HCF of a and b is = "+hcf(a, b));
        System.out.println("LCM of a and b is = "+lcm2(a, b));
    }
    static int lcm1(int a,int b){
        int max = Math.max(a, b);
        while(max>0){
            if(max%a == 0 && max%b == 0)
              break;
        max++;      
        }
        return max;
    }
    static int hcf(int a,int b){
        if(b == 0)
          return a;
        return hcf(b, a%b);  
    }
    static int lcm2(int a,int b){
        return (a*b)/hcf(a, b);
    }
}
