public class Palindrome {

    private String input;

    public Palindrome(){}

    public Palindrome(String s){
        input = s;
    }

    public int isPal(){
        String strip = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuffer reverse = new StringBuffer(strip).reverse();
        return ((strip.length() > 1) && reverse.toString().equals(strip)) ? 1 : 0;
    }
}