// package ArraysBeginnerQuestions;

public class CountNumberOfZerosAndOnes {
    public static void main(String[] abs){
    int [] arr = {1,9,0,0,1,0,1,0,1,1};
    count1s0s(arr);
    }
    static void count1s0s(int[] arr){
        int countZeros = 0;
        int countOnes = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                countOnes++;
            }else if(arr[i] == 0){
                countZeros++;
            }
        }
        System.out.printf("The Number of Ones is : %d\n and \n the number of zeros is : %d",countOnes, countZeros);
    }
}
