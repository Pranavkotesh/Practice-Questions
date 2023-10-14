// //Give the indices of the elements in the array that add up to the target element.
// class solution{
//     /**
//      * @param arr
//      * @param result
//      * @return
//      */
//     public static int []target(int []arr, int result) {
//         int i,j;
//         int n = arr.length;
//         for(i = 0; i<n;i++){
//             for(j=1;j<n;j++){
//                 if(arr[i]!=arr[j]){
//                     int target;
//                     if(arr[i]+arr[j]==target){
//                         return new int[]{i,j};
//                     }
//                 }
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         int result= 5;
//         target(arr,result);

//     }
// }