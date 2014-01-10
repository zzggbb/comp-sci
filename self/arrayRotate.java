import java.util.Random;

public class arrayRotate {

    public static void main(String[] args) {

        int MAX = 20;
        int MIN = 1;
        int SIZE = 7;

        Random r = new Random();
        int[] numbers = new int[SIZE];
        for (int i=0; i<SIZE; i++) {
            numbers[i] = r.nextInt((MAX - MIN) + 1) + MIN;
        }
        for (int i=0; i<SIZE; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] newNumbers = rotate(numbers, 1, false);

        for (int i=0; i<SIZE; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int[] rotate(int[] nums, int amount, boolean left) {

        for (int j=0; j<amount; j++) {
            for (int i=0; i<nums.length-1; i++) {
                if (left) {
                    int temp = nums[i%nums.length];
                    nums[i%nums.length] = nums[(i+1)%nums.length];
                    nums[(i+1)%nums.length] = temp;
                } else {
                    int temp = nums[(i+1)%nums.length];
                    nums[(i+1)%nums.length] = nums[i%nums.length];
                    nums[i%nums.length] = temp;
                }
            }
        }
        return nums;
    }
}