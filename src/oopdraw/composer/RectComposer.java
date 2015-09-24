package oopdraw.composer;
import java.awt.Point;

import oopdraw.shape.AbstractShape;
import oopdraw.shape.adapter.RectangleAdapter;

public class RectComposer implements ShapeComposer {

	private RectangleAdapter shape;
	
	@Override
	public AbstractShape create(Point startPos) {
		shape = new RectangleAdapter(startPos); // Create the shape - Rectangle
		shape.setStart(startPos);// Set the start position where mouse went down
		return shape;
	}

	@Override
	public void expand(Point p) {
		int x = (int) p.getX();
		int y = (int) p.getY();
		Point startPos = shape.getStart();
		Point newstart = new Point(Math.min(x, startPos.x), Math.min(y, startPos.y));

		shape.setStart(newstart);
		shape.setEnd(p);
	}

	@Override
	public void complete(Point p) {
		expand(p);
	}

}
