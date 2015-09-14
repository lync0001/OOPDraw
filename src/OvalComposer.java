import java.awt.Point;

public class OvalComposer implements ShapeComposer {

	@Override
	public AbstractShape create(Point startPos) {
		Oval oval = new Oval(); // Create the shape - Oval
		oval.setStart(startPos);// Set the start position where mouse went down
		return oval;
	}

	@Override
	public void expand(AbstractShape shape, Point p) {
		int x = (int) p.getX();
		int y = (int) p.getY();
		Point startPos = shape.getStart();
		Point drawto = new Point(Math.max(x, startPos.x), Math.max(y, startPos.y));
		Point newstart = new Point(Math.min(x, startPos.x), Math.min(y, startPos.y));
		int newWidth = Math.abs((drawto.x - newstart.x));
		int newHeight = Math.abs((drawto.y - newstart.y));
		
		Oval oval = (Oval) shape;
		oval.setWidth(newWidth);
		oval.setHeight(newHeight);
		oval.setStart(newstart);
	}

	@Override
	public void complete(AbstractShape shape, Point p) {
		int x = (int) p.getX();
		int y = (int) p.getY();
		Oval currentShape = (Oval) shape;
		Point currentStart = currentShape.getStart();
		Point drawto = new Point(Math.max(x, currentStart.x), Math.max(y, currentStart.y));
		Point newStart = new Point(Math.min(x, currentStart.x), Math.min(y, currentStart.y));
		int newWidth = Math.abs((drawto.x - newStart.x));
		int newHeight = Math.abs((drawto.y - newStart.y));

		currentShape.setWidth(newWidth);
		currentShape.setHeight(newHeight);
		currentShape.setStart(newStart);
	}

}
