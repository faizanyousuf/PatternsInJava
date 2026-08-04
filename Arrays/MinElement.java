public class MinElement {
    public static void main(String[] args) {
        int [] arr = {22,423,423,5,23,4, -234,22};

        int min = arr[0];

        for(int val : arr){
            if(val < min){
                min = val;
            }
        }
        System.out.println(min);
    }
}
