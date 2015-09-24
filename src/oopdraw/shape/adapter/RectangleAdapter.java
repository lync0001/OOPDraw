package oopdraw.shape.adapter;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

import oopdraw.shape.Rectangle;

public class RectangleAdapter extends Rectangle {
	
	private Rectangle2D.Double rectangle;

	public RectangleAdapter(Point startPoint) {
		super();
		rectangle = new Rectangle2D.Double();
		setStart(startPoint);
		setEnd(new Point(0, 0));
	}
	
	@Override
	public void setStart(Point pt) {
		rectangle.setRect(pt.getX(), pt.getY(), getEnd().getX(), getEnd().getY());
		super.setStart(pt);
	}

	@Override
	public void setEnd(Point pt) {
		rectangle.setFrameFromDiagonal(getStart(), pt);
		super.setEnd(pt);
	}

	@Override
	public void setWidth(int w) {
		rectangle.width = w;
		super.setWidth(w);
	}

	@Override
	public void setHeight(int h) {
		rectangle.height = h;
		super.setHeight(h);
	}

	@Override
	public void Draw(Graphics2D g) {
		g.setColor(super.clrFront);
		g.draw(rectangle);
	}
	
}
