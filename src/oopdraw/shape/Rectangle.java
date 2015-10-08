package oopdraw.shape;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class Rectangle extends AbstractShape {
	
	private Rectangle2D.Double rectangle;

	public Rectangle(Point startPoint) {
		super();
		rectangle = new Rectangle2D.Double();
		ptStart = startPoint;
		setEnd(new Point(0, 0));
		setStart(startPoint);
	}
	
	@Override
	public void setStart(Point pt) {
		rectangle.setRect(pt.getX(), pt.getY(), getEnd().getX(), getEnd().getY());
		ptStart = pt;
	}

	@Override
	public void setEnd(Point pt) {
		rectangle.setFrameFromDiagonal(getStart(), pt);
		ptEnd = pt;
	}

	@Override
	public void Draw(Graphics2D g) {
		g.setColor(super.clrFront);
		g.draw(rectangle);
	}
	
}
