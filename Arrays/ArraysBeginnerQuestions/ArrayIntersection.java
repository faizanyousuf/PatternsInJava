// package ArraysBeginnerQuestions;
import java.util.ArrayList;
public class ArrayIntersection {
    public static void main(String[] args){

        int[] arr1 = {2,4,5,6,8,9,11};
        int[] arr2 = {3,4,5,6,7,8,9,22,24};
        arrayIntersection(arr1,arr2);


    }
    static void arrayIntersection(int[] arr1,int[] arr2){
        int length = Math.min(arr1.length,arr2.length);
        // int [] intersection = new int[length];
        ArrayList<Integer> intersection = new ArrayList<>();
         int k = 0;
        for(int i = 0; i < arr1.length; i++){
            int currentElement = arr1[i];
            for(int j = 0; j < arr2.length; j++){
                if(arr2[j] == currentElement){
                    intersection.add(currentElement);
                    k++;
                }
            }
        }
       for(int val : intersection){
        System.out.print(val +" ");
       }
       System.out.println();

    }
}
