import apcslib.*;
import java.util.ArrayList;

public class GraphicFun {
	public static void main(String[] args){
		ArrayList <BodyPart> dog = new ArrayList <BodyPart> ();
		dog.add(new Ears());
		dog.add(new Head());
		dog.add(new Tail());
		dog.add(new Nose());
		
		for (BodyPart dogPart : dog){
			dogPart.draw();
		}
	}
}