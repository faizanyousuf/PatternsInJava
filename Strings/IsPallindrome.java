public class IsPallindrome {
    public static void main(String[] args){
        String str = "racear";

        String rev = "";
        int length = str.length();

        for(int i = length-1; i>=0; i--){
            rev +=str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("String is pallindrome");
        }else{
            System.out.println("String is not pallindrome");
        }
    }
}
