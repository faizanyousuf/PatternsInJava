import java.util.ArrayList;
public class Demo{
    public static void main(String[] args){
        Solution s = new Solution();
         ArrayList<Integer> result = s.findTwoElement(new int[]{6,5,8,7,1,4,1,3,2});
         System.out.println(result);
    }
}


class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        int n = arr.length;
        int totalSum = (n*(n+1))/2;
        System.out.println(totalSum);

        for(int i = 0; i < arr.length; i++){
            sum += Math.abs(arr[i]);
              int index = Math.abs(arr[i])-1;
              if(arr[index] > 0){
              arr[index] = -arr[index];
              }
        }
        System.out.println(sum);
    
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
        
        int missing = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                missing = i+1;
                break;

            }
            }
            System.out.println(missing);
            
        sum += missing;
       int  duplicate = sum-totalSum;
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}