public class Calculator {

	private int myX,myY;

	public Calculator(int x, int y) {
		myX = x;
		myY = y;
	}

	public int add() {
		int sum = myX + myY;
		return sum;
	}
}