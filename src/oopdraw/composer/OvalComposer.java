package oopdraw.composer;
import java.awt.Point;

import oopdraw.shape.AbstractShape;
import oopdraw.shape.Oval;

public class OvalComposer implements ShapeComposer {

	private Oval shape;
	
	@Override
	public AbstractShape create(Point startPos) {
		shape = new Oval(startPos); // Create the shape - Oval
		shape.setStart(startPos);// Set the start position where mouse went down
		return shape;
	}

	@Override
	public void expand(Point p) {
		shape.setStart(shape.getStart());
		shape.setEnd(p);
	}

	@Override
	public void complete(Point p) {
		expand(p);
	}

}
