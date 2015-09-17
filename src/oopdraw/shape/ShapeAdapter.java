package oopdraw.shape;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

public class ShapeAdapter extends AbstractShape {

	private Line2D.Double shape;
	
	public ShapeAdapter(Line2D.Double shape){
		this.shape = shape;
	}
	
	@Override
	public void setStart(Point pt) {
		shape.x1 = pt.getX();
		shape.y1 = pt.getY();
	}

	@Override
	public void setEnd(Point pt) {
		shape.x2 = pt.getX();
		shape.y2 = pt.getY();
	}

	@Override
	public void Draw(Graphics2D g) {
		g.draw(shape);
	}

}
