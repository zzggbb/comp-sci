import apcslib.*;

abstract class BodyPart {
	
	protected static SketchPad paper = new SketchPad(600,600);
	protected static DrawingTool pen = new DrawingTool(paper);
	
	abstract void draw();
}