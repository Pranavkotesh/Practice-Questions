
public class Pattern1 {
    public static void main(String[] args) {
        // pattern1(4);
        pattern3(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col\
            //for(imt col=n;col>=row;col--)
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a new line
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
         
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<2*n-1;row++){
            
        }
    }
}
