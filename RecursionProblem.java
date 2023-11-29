public class RecursionProblem{

    public static void main(String []args){
        //recursion:-Calling a function in itself
        //base condition:To break the function and not allowing it to loop infinite times
        //Printing numbers in a rnge using recursion
        print(3,20);
    }
    static void print(int n,int x){
        if(n==x){//base condition
            System.out.println(n);
            System.out.println("End reached");
            return;
        }
        System.out.println(n);
        print(n+1,x);
    }
}