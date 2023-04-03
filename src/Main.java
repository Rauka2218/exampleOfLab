public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 7, 32, 3, 5};
        int min = findMin(arr, arr.length);
        System.out.println("Min from arr is: "+ min + " " + arr.length);
    }
    public static int findMin(int[] arr, int n){
        if(n==1)
            return arr[0];
        else{
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
}