// package ArrayManipulationProblems;

public class ReverseAnArray {
    public static void main(String[] args){

          int [] arr = {2,4,5,6,2,32,23,42};
        //   reverseArray(arr);
            reverseInplace(arr);
    }
    static void reverseArray(int[] arr){
        int[] revArr = new int[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr.length; i++){
             revArr[k] = arr[i];
             k--;
        }
        for(int val : revArr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    static void reverseInplace(int[] arr){
            int[] newArr = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            System.out.println("Printing new Array: ");
            for(int val : newArr){
                System.out.print(val +" ");
            }
            System.out.println();
            int k = newArr.length -1;
            for(int i = 0; i < newArr.length/2; i++){
             swap(newArr, i, k);
             k--;
            }
            for(int val : newArr){
                System.out.print(val+" ");
            }
            System.out.println();
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
