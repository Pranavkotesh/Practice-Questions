import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b =1;
        // int count=2;
        for(int i =2;i<n;i++){
            int temp = b;
            b=b+a;
            a=temp;
        }
        System.out.println(b);
        in.close();
    }
}
