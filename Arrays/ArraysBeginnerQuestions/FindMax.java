// package ArraysBeginnerQuestions;

public class FindMax {
    public static void main(String[] args){
        int[] arr = {45,24,52,5624,622,62,2452};
        max(arr);
    }
    static void max(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("maximum element is : "+max);
    }
}
