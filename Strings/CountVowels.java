public class CountVowels {
    public static void main(String[] args){
        String str = "kkadalveiaei";
        String lowerStr = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch =  lowerStr.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               System.out.println(ch);
                count +=1;
            }
        }
        System.out.println(count);
    }
}
