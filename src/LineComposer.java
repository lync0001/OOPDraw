import java.awt.Point;

public class LineComposer implements ShapeComposer {

	@Override
	public AbstractShape create(Point startPos) {
		Line line = new Line(); // Create the shape - Line
		line.setStart(startPos);// Set the start position where mouse went down
		return line;
	}

	@Override
	public void expand(AbstractShape shape, Point p) {
		shape.setEnd(p); // and set its end point.
	}

	@Override
	public void complete(AbstractShape shape, Point endPos) {
		shape.setEnd(endPos);
	}

}
