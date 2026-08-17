// package ArrayManipulationProblems;

public class PrintExtremeElements {
    public static void main(String[] args){

        int[] arr = {4,5,2,6,7,9,19};
        extremeElements(arr);


    }
    static void extremeElements(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int k = 0;
       int [] extremes = new int[arr.length];
        while(i <= j){
            if(i != j){
              extremes[k] = arr[i];
              k++;
              extremes[k] = arr[j];
              k++;
            }else{
                extremes[k] = arr[i];
            }
            i++;
            j--;
        }
        for(int val : extremes){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
