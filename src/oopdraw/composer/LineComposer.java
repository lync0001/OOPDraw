package oopdraw.composer;
import java.awt.Point;

import oopdraw.shape.AbstractShape;
import oopdraw.shape.Line;
import oopdraw.shape.adapter.LineAdapter;

public class LineComposer implements ShapeComposer {

	private LineAdapter shape;
	
	@Override
	public AbstractShape create(Point startPos) {
		shape = new LineAdapter(startPos); // Create the shape - Line
		shape.setStart(startPos);// Set the start position where mouse went down
		return shape;
	}

	@Override
	public void expand(Point p) {
		shape.setEnd(p); // and set its end point.
	}

	@Override
	public void complete(Point endPos) {
		expand(endPos);
	}

}
