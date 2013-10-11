import apcslib.*;
import java.awt.Color;

public class ParallelLines {

	int SQR_SEP = 20;
	int WIG_OFFSET = 10;
	int SQR_SIZE = 20;
	int ROWS = 8;
	int COLS = 7;
	int WIDTH = 500;
	int HEIGHT = 500;

	private SketchPad paper;
	private DrawingTool pen;

	public ParallelLines(){
		paper = new SketchPad(WIDTH,HEIGHT);
		pen = new DrawingTool(paper);
	}

	public void draw(){

		int xOffset = (SQR_SIZE*(COLS-2)+COLS*SQR_SEP)/2;
		int yOffset = SQR_SIZE*(ROWS-2)/2;
		int[] offsets = {0,1,0,-1};
		int index = 0;

		for (int row = 0; row < ROWS; row++){
			for (int col = 0; col < COLS; col++){

				int wig = offsets[index%(offsets.length)];
				int xPos = col*(SQR_SEP+SQR_SIZE)-xOffset;
				int yPos = row*SQR_SIZE-yOffset;

				pen.up();
				pen.move(xPos+wig*WIG_OFFSET,yPos);
				pen.down();
				pen.setColor(Color.black);
				pen.fillRect(SQR_SIZE,SQR_SIZE);
			}
			index++;
			int yAlg = (SQR_SIZE*(2*row-1)-2*yOffset)/2;
			pen.up();
			pen.move(-xOffset,yAlg);
			pen.down();
			pen.move(xOffset,yAlg);
		}
	}

}