// package ArraysBeginnerQuestions;

public class SwapAlternateElements {
    public static void main(String[] args){

        int [] arr = {3,5,4,9,2,0,24,90};
        swapAlternate(arr);
         for(int val : arr){
         System.out.print(val+" ");
         }
         System.out.println();
    }
    static void swapAlternate(int [] arr){
           for(int i = 0; i < arr.length -1 ; i+=2){
              swap(arr, i, i+1);
           }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
