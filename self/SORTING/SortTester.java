import java.util.Scanner;

public class SortTester {

    public static void main(String[] args) {

        final int[] intArray = {84,62,50,15,83,82};
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an algorithm or press q to exit: ");
        System.out.println("i: Insertion");
        System.out.println("b: Bubble");
        System.out.println("s: Selection");

        String choice = input.nextLine();
        while (!choice.equals("q")) {
            if (choice.equals("i")) {
                new SortLib(intArray).insertionSort();
            }
            if (choice.equals("b")) {
                new SortLib(intArray).bubbleSort();
            }
            if (choice.equals("s")) {
                new SortLib(intArray).selectionSort();
            }
            choice = input.nextLine();
        }

    }
}