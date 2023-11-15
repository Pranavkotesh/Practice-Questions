// import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
        // Scanner in = new Scanner (System.in);
        int n = 5544;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        // if the input is an array we can iterate through it using indexes and increase
        // the count
    }
}
