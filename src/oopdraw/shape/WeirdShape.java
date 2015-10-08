package oopdraw.shape;

import java.awt.Graphics2D;
import java.awt.Point;

public class WeirdShape extends AbstractShape {
	private Oval oval;
	private Line line;
	
	public WeirdShape(Point startShape) {
		oval = new Oval(new Point(0, 0));
		line = new Line(new Point(0, 0));
		setStart(startShape);
		setEnd(new Point(0, 0));				
	}

	@Override
	public void setStart(Point pt) {
		ptStart = pt;
		oval.setStart(pt);
		line.setStart(pt);
	}

	@Override
	public void setEnd(Point pt) {
		ptEnd = pt;
		oval.setEnd(pt);
		line.setEnd(pt);
	}

	@Override
	public void Draw(Graphics2D g) {
		oval.Draw(g);
		line.Draw(g);
	}
}
