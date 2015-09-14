import java.awt.Point;

public class RectComposer implements ShapeComposer {

	@Override
	public AbstractShape create(Point startPos) {
		Rectangle rectangle = new Rectangle(); // Create the shape - Rectangle
		rectangle.setStart(startPos);// Set the start position where mouse went down
		return rectangle;
	}

	@Override
	public void expand(Point p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void complete(AbstractShape shape, Point p) {
		int x = (int) p.getX();
		int y = (int) p.getY();
		
		Point startPos = shape.getStart();
		Point drawto = new Point(Math.max(x, startPos.x), Math.max(y, startPos.y));
		Point newstart = new Point(Math.min(x, startPos.x), Math.min(y, startPos.y));
		int newWidth = Math.abs((drawto.x - newstart.x));
		int newHeight = Math.abs((drawto.y - newstart.y));

		Rectangle rectangle = (Rectangle) shape;
		rectangle.setWidth(newWidth);
		rectangle.setHeight(newHeight);
		rectangle.setStart(newstart);
	}

}
