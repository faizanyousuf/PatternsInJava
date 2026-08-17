import java.util.Map;
import java.util.HashMap;

public class ModeOfAnArray{
    public static void main(String[] args){
           int [] arr = {3,4,5,5,2,2,4,6,9,9,9};
        Map<Integer,Integer> map = new HashMap<>();
          
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        System.out.println(map);
         int max = Integer.MIN_VALUE;
        //  int[] mode = new int[map.size()];
        //  int k = 0;
        int element = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
             if(entry.getValue() > max){
                element = entry.getKey();
             }
        }
        System.out.println("Mode is : "+ element);
    }
}