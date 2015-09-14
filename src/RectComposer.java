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
	public void complete(Point p) {
		// TODO Auto-generated method stub

	}

}
