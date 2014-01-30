public class Recursion {
    public static void main(String[] args){
        System.out.print(power(2,5));
    }
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}