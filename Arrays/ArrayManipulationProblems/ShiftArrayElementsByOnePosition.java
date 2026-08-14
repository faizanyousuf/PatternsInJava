// package ArrayManipulationProblems;

public class ShiftArrayElementsByOnePosition {
    public static void main(String[] args){
   
        // int[] arr = new int[5];
        // arr[0] = 42;
        // arr[1] = 20;
        // arr[2] = 24;
        // arr[3] = 98;

        int[] arr = {24,25,52,52,63,71,90};
        for(int val : arr){
            System.out.print(val+ " ");
        }
        System.out.println();
        shiftArray(arr);

    }
    public static void shiftArray(int[] arr){
        int lastElement = arr[arr.length-1];

        for(int i = arr.length-2; i > 0; i--){
             arr[i+1] = arr[i];
        }
        arr[0] = lastElement;

        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
