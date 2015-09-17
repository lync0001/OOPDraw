import java.awt.Point;

public class RectComposer implements ShapeComposer {

	private Rectangle shape;
	
	@Override
	public AbstractShape create(Point startPos) {
		shape = new Rectangle(); // Create the shape - Rectangle
		shape.setStart(startPos);// Set the start position where mouse went down
		return shape;
	}

	@Override
	public void expand(Point p) {
		int x = (int) p.getX();
		int y = (int) p.getY();
		Point startPos = shape.getStart();
		Point drawto = new Point(Math.max(x, startPos.x), Math.max(y, startPos.y));
		Point newstart = new Point(Math.min(x, startPos.x), Math.min(y, startPos.y));
		
		int newWidth = Math.abs((drawto.x - newstart.x));
		int newHeight = Math.abs((drawto.y - newstart.y));
		
		shape.setWidth(newWidth);
		shape.setHeight(newHeight);
		shape.setStart(newstart);
	}

	@Override
	public void complete(Point p) {
		expand(p);
	}

}
