
import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args){
        int arr[] = new int [3];

          System.out.println(arr.length);

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= arr.length; i++){
            arr[i-1] = sc.nextInt();
        }
       int sum = 0;
       System.out.println("your array contains: ");
        for(int val : arr){
            sum +=val;
            System.out.println(val);
        }
        System.out.println(sum);
    }
}