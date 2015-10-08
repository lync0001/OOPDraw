package oopdraw.composer;
import java.awt.Point;

import oopdraw.shape.AbstractShape;
import oopdraw.shape.Rectangle;

public class RectComposer implements ShapeComposer {
	
	private Rectangle shape;
	
	@Override
	public AbstractShape create(Point startPos) {
		shape = new Rectangle(startPos); // Create the shape - Rectangle
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
