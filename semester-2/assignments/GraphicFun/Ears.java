class Ears extends BodyPart {
	
	private int myX, myY, myHeight, myLength, mySep;
	
	public Ears(){
		super();
		myX = 0;
		myY = 300;
		myHeight = 30;
		myLength = 10;
		mySep = 50; 
	}
	public Ears(int x, int y, int height, int length, int sep){
		super();
		myX = x;
		myY = y;
		myHeight = height;
		myLength = length;
		mySep = sep;
	}
	
	public void draw() {
		pen.up();
		pen.move(myX+mySep, myY);
		pen.down();
		pen.drawOval(myHeight, myLength);
		
		pen.up();
		pen.move(myX-mySep, myY);
		pen.down();
		pen.drawOval(myHeight, myLength);
	}
}