// package ArraysBeginnerQuestions;

public class SumOfPositiveAndNegative {
    public static void main(String[] args){
        
        int[] arr = {-14,24,52,0,2342,-232,323,-342};
        posNegSum(arr);

    }
    static void posNegSum(int[] arr){
           int pos = 0;
           int neg = 0;
           for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos += arr[i];
            }else if(arr[i] < 0){
                neg += arr[i];
            }
           }

           System.out.printf("The positive sum is : %d \n and \nThe negative sum is : %d\n",pos,neg);
    }
}
