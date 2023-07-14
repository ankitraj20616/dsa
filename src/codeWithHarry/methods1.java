package codeWithHarry;
import  java.util.Scanner;
public class methods1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b =");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = add(a,b);
        System.out.println("Sum of a and b is = "+c);
    }
    static int add(int a,int b)
    {
        int c = a+b;
        return  c;
    }

}
