// package ArraysBeginnerQuestions;

public class FirstUnsortedElement {
    public static void main(String[] args){
        int[] arr  = {3,4, 8, 10, 14, 20,24, 21, 25};
        unsortedElement(arr);

    }
    static void unsortedElement(int[] arr){
        int unsortedElement = -1;
        //for increasing array
        for(int i = 0; i < arr.length;  i++){
            if(arr[i + 1] < arr[i]){
                unsortedElement = arr[i + 1];
                break;
            }
        }
        System.out.printf("Unsorted element is : %d\n",unsortedElement);
    }
}
