// Write a java program to print array elements.
class PrintArray{
    void printArr(int[] arr){
        int[] newArr = arr;
        for (int i = 0; i< newArr.length; i++){  
            System.out.print(newArr[i]+" ");
        } 
    }
}
public class Demo065 {
    public static void main(String[] args) {
        PrintArray obj = new PrintArray();
        int[] arr = {10,20,30,40};
        obj.printArr(arr);
    }
}