/* Name:        Zane Bradley
 * File:        Palindrome.java
 * Purpose: Provide the PalindromeTester.java with a Palindrome object and the isPal() method.
 */

public class Palindrome {

    	private String input;
	
	public Palindrome(){}
	
    	public Palindrome(String s){
    	    	input = s;
    	}

    	public boolean isPal(){
		String strip = input.toLowerCase().replaceAll("[^a-z0-9]","");
		int correct = 0;
		//System.out.println(strip.length());
		for (int i=0; i < strip.length(); i++) {
			//if (strip.charAt(i) == strip.charAt(strip.length()-i-1)) {
			//correct++;
			
			correct += ( (strip.charAt(i) == strip.charAt(strip.length()-i-1)) ? 1 : 0 );
			
		}
		return (correct == strip.length() && strip.length() > 1);
	}


/*
        // convert to lowercase and remove all non-alphanumeric characters
        String strip = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        // create a string buffer object with 'strip' and reverse it
        StringBuffer reverse = new StringBuffer(strip).reverse();
        // make sure the stripped version has more than 1 significant character and
        // is the same word as its reversed version
        return ((strip.length() > 1) && reverse.toString().equals(strip));
*/

}
