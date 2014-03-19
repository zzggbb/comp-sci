class Head extends BodyPart {
	
	private int myHeight, myLength, myX, myY;

	public Head(){
		super();
		myHeight = 200;
		myLength = 300;
		myX = 0;
		myY = 0;
		
	}
	public Head(int height, int length, int x, int y){
		myHeight = height;
		myLength = length;
		myX = x;
		myY = y;
	}
	public void draw(){
		pen.up();
		pen.move(myX,myY);
		pen.down();
		pen.drawOval(myHeight, myLength);
	}
}