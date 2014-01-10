// name:  		Coins.java
//
// program: 	CoinsTester
//
// purpose:		This class accepts a certain number of monetary change. The output is a list of the number 
//				of quarters, dimes, nickels, and pennies that will make that amount of change with the least 			
// 				number of coins possible.
	 
public class Coins {

	private int myChange;
	
	public Coins(int change) {
		myChange = change;
	}

	public void calculate() {
		
		String[] coinNames = {"Quarters","Dimes","Nickels","Pennies"};
		int[] coinValues = {25,10,5,1};
		int[] coinCount = new int[4];
		int n = myChange;
		System.out.println(myChange + " cents is:");
		for(int i = 0; i < 4; i++) {
			coinCount[i] = (n / coinValues[i]);
			n = n - (coinCount[i] * coinValues[i]);
			System.out.println(coinCount[i] + " " + coinNames[i]);
		}
	}
}