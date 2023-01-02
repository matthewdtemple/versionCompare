


public class ispal {

    public static boolean isPal(String text){
        String reversedText = "";
        for (int i = 0; i < text.length(); i++){
            reversedText = text.charAt(i) + reversedText;
        }
        return reversedText.equals(text);
    }

    public static boolean isPal2(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args){
        System.out.println(isPal2("raccar"));
    }
}

