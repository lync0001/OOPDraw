package oopdraw.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Oval extends AbstractShape {
	
	private Ellipse2D.Double shape;
	
	public Oval(Point startPos) {
		shape = new Ellipse2D.Double();
		setStart(startPos);
		setEnd(new Point(0, 0));
	}

	@Override
	public void setStart(Point pt) {
		shape.setFrameFromDiagonal(pt, getEnd());
		ptStart = pt;
	}

	@Override
	public void setEnd(Point pt) {
		shape.setFrameFromDiagonal(getStart(), pt);
		ptEnd = pt;
	}
	
	public Point getStart() {
		return ptStart;
	}

	public Point getEnd() {
		return new Point(0, 0);
	}
	
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(Color.green.darker());
		g.draw(shape);
	}
}
