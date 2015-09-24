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
		int x = (int) p.getX();
		int y = (int) p.getY();
		Point startPos = shape.getStart();
		Point drawto = new Point(Math.max(x, startPos.x), Math.max(y, startPos.y));
		Point newstart = new Point(Math.min(x, startPos.x), Math.min(y, startPos.y));
		int newWidth = Math.abs((drawto.x - newstart.x));
		int newHeight = Math.abs((drawto.y - newstart.y));
	
		shape.setWidth(newWidth);
		shape.setHeight(newHeight);
		shape.setStart(newstart);
		shape.setEnd(p);
	}

	@Override
	public void complete(Point p) {
		expand(p);
	}

}
