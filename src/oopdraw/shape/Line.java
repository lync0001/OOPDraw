package oopdraw.shape;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

public class Line extends AbstractShape {
	private Line2D.Double line;
	
	public Line(Point startPoint) {
		setStart(startPoint);
		setEnd(new Point(0, 0));
	}

	@Override
	public void setStart(Point pt) {
		line = new Line2D.Double();
		ptStart = pt;
	}

	@Override
	public void setEnd(Point pt) {
		line.setLine(getStart(), pt);
		ptEnd = pt;
	}
	
	public Point getStart() {
		return ptStart;
	}

	public Point getEnd() {
		return ptEnd;
	}

	@Override
	public void Draw(Graphics2D g) {
		g.setColor(super.clrFront);
		g.draw(line);
	}
	
	
}
