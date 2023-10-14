// import java.util.Scanner;

class SecondLargestNumber{
    public static void main(String []args){
        // taking input
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();
        //finding second largest using math.max
        int[] arr={10,2,3,4,8,6,7,9};
        int initial= arr[0];
        int max=0;
        for(int i=0;i<arr.length;i++){
            max= Math.max(initial, arr[i]);
        }
        // int max= Math.max(max,arr);
        System.out.println(max);

    }
}