// package ArraysBeginnerQuestions;

public class MultiplyEachBy10 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,76,90,23};
         multiply(arr);
         for(int val : arr){
            System.out.print(val +" ");
         }
        
    }

    static void multiply(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= 10;
        }
    }
}
