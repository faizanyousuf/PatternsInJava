import java.util.Map;
import java.util.HashMap;
public class HighestAndLowest {
    public static void main(String[] args){

        // int [] arr = {2,4 ,3,4,9,2,9,8,9,2,1,4,5,};
        int [] arr = {3,3};
        highAndLow(arr);

    }

  static  public void highAndLow(int[] arr){
          
        Map<Integer , Integer> map = new HashMap<>();

        for(int val : arr){
            if(map.containsKey(val)){
                map.put(val,map.get(val) + 1);
            }else{
                map.put(val,1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        int min = Integer.MAX_VALUE;
        int minElement = -1;
        int max = Integer.MIN_VALUE;
        int maxElement = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= max){
                 max = entry.getValue();
                 maxElement = entry.getKey();
            }
             if(entry.getValue() < min){
                min = entry.getValue();
                minElement = entry.getKey();
             }
        }
        System.out.println("min element: "+ minElement);
        System.out.println("max element : " + maxElement);

    }
}
