package oopdraw.shape.adapter;

import java.awt.Point;
import java.awt.geom.Ellipse2D;

import oopdraw.shape.Oval;

public class OvalAdapter extends Oval {
	
	private Ellipse2D.Double shape;
	
	public OvalAdapter(Point startPos) {
		shape = new Ellipse2D.Double();
		setStart(startPos);
		setEnd(new Point(0, 0));
	}

	@Override
	public void setStart(Point pt) {
		shape.setFrameFromDiagonal(pt, getEnd());
		super.setStart(pt);
	}

	@Override
	public void setEnd(Point pt) {
		shape.setFrameFromDiagonal(getStart(), pt);
		super.setEnd(pt);
	}
	
	
}
