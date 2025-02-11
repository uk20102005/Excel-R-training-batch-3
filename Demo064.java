class SwapArrayElements{
    void swap(int[] arr){
        int len = arr.length;
        System.out.println(arr[0] + "    "+ arr[len-1]); //--> 5 , 10
        arr[0] = arr[0] + arr[len-1];  //--> 15 = 5 + 10
        // System.out.println(arr[0] + "    "+ arr[len-1]);
        arr[len-1] = arr[0] - arr[len-1]; //--> 5 = 15 - 10
        // System.out.println(arr[0] + "    "+ arr[len-1]);
        arr[0] = arr[0] - arr[len-1];      //--> 10 = 15 - 5
        System.out.println(arr[0] + "    "+ arr[len-1]);
    }
}
public class Demo064 {
    public static void main(String[] args) {
        SwapArrayElements obj = new SwapArrayElements();
        int[] arr = {70,20,50,80};
        obj.swap(arr);
    }
}