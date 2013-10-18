import java.util.Scanner;

public class PalindromeTester {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] resp = {"IS NOT", "IS"};
        boolean cont = true;
        while (cont){
            System.out.println("Give a string or type q to exit: ");
            String userin = s.nextLine();
            Palindrome p = new Palindrome(userin);
            cont = !(userin.equals("q"));
            System.out.println(cont ? "\"" + userin + "\" " + resp[p.isPal()] +" a palindrome" : "Program will exit...");
        }
    }
}