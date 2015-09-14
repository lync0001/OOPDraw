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
	public void complete(Point p) {
		// TODO Auto-generated method stub

	}

}
