package Recursion;

public class funNumbers {
    public static void main(String[]args){
        funBoth(5);
    }
    //Here the numbers are printed in both 1-n and n-1 order
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);//n to 1 order
        funBoth(n-1);
        System.out.println(n);// 1 to n order
    }
}
