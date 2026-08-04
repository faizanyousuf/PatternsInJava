public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {20,21,44,55 ,234,3,2353,253,2,322};

        int max = arr[0];

        for(int val : arr){
            if(val > max){
                max = val;
            } 
        }
        System.out.print(max);
    }
}
