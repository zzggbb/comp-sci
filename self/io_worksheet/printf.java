import java.util.Scanner;

public class printf {
	
	public static void main(String[] args){
		
	//	System.out.printf("%", );
		System.out.printf("%-4s", "***");
		System.out.printf("%5s", "***\n");
		System.out.printf("%d", 12345678);
		System.out.println();
		System.out.printf("%10.2f", 75.123);
		System.out.printf("%5.2f", 75.126);
		System.out.println();
		System.out.printf("%.2s %2s", "Chile", "Pepper");
	
	}
}