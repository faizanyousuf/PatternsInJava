// package ArraysBeginnerQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SearchInArray {
    public static void main(String[] args) {
        int[] list = {24,42,5,22,52,552,52,23};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(24);
        arr.add(56);
        arr.add(24);
        arr.add(89);
        // arr.addAll(Arrays.asList(list));
        // List<Integer> li = Arrays.asList(list);
        // arr.addAll(list);

        for(int val : list){
            System.out.print(val+" ");
        }
        System.out.println();
        search(list,42);

    }
    static void search(int[] arr,int target){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found on index : "+i);
                return;
            }
        }
        System.out.print("Element not found!");
    }
}
