package oopdraw.composer;

import java.awt.Point;

import oopdraw.shape.AbstractShape;
import oopdraw.shape.WeirdShape;

public class WeirdShapeComposer implements ShapeComposer {

	private WeirdShape shape;
	
	@Override
	public AbstractShape create(Point startPoint) {
		shape = new WeirdShape(startPoint);
		shape.setStart(startPoint);// Set the start position where mouse went down
		return shape;
	}

	@Override
	public void expand(Point p) {
		Point startPos = shape.getStart();
		shape.setStart(startPos);
		shape.setEnd(p);
	}

	@Override
	public void complete(Point p) {
		expand(p);
	}

}
