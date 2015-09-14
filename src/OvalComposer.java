import java.awt.Point;

public class OvalComposer implements ShapeComposer {

	@Override
	public AbstractShape create(Point startPos) {
		Oval oval = new Oval(); // Create the shape - Oval
		oval.setStart(startPos);// Set the start position where mouse went down
		return oval;
	}

	@Override
	public void expand(Point p) {
		// TODO Auto-generated method stub

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
