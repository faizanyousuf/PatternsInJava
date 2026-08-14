public class FindAverage{
    public static void main(String[] args) {
        int[] arr = {23,24,52,25,231,42,23};
        
        average(arr);
    
    }
    static void average(int[] arr){
        int sum = 0;
        int average;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum/arr.length;
        System.out.println("Average is : "+average);
    }
}