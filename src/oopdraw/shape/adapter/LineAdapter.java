package oopdraw.shape.adapter;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

import oopdraw.shape.Line;

public class LineAdapter extends Line {
	private Line2D.Double line;
	
	public LineAdapter(Point startPoint) {
		setStart(startPoint);
		setEnd(new Point(0, 0));
	}

	@Override
	public void setStart(Point pt) {
		line = new Line2D.Double();
		super.setStart(pt);
	}

	@Override
	public void setEnd(Point pt) {
		line.setLine(getStart(), pt);
		super.setEnd(pt);
	}

	@Override
	public void Draw(Graphics2D g) {
		g.setColor(super.clrFront);
		g.draw(line);
	}
	
	
}
