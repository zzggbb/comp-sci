//Name:
//
//Purpose:
//
//File Name
import apcslib.*;
import java.awt.Color;

public class ParallelLines{

    private DrawingTool pen;
    private SketchPad paper;

    public ParallelLines() {

        paper = new SketchPad(1400,800);
        pen = new DrawingTool(paper);

        pen.up();
        int x = 0;
        int y = 0;
        int w = 0; //the x of the lines
        int v = 0; // the y of the lines

        for(int row = 0; row < 8; row++){

            int[][] coords = {{0,5},{5,-5},{7,-15},{5,-25},{0,-35},{5,-45},{7,-55},{5,-65}};
            pen.move(coords[row][0],coords[row][1])

            for (int col = 0; col < 7; col++){
                pen.down();
                pen.fillRect(10,10);
                pen.up();
                x+=20;     //to move over each square
                pen.move(x,y);
            }

            //for the lines
            pen.up();
            pen.move(w,v);
            pen.down();
            pen.move(125,v);
            pen.up();
            v-=10;
        }
    }
}