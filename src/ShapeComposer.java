import java.awt.Point;

public interface ShapeComposer {
	public AbstractShape create(Point startPoint);
	public void expand(Point p);
	public void complete(AbstractShape shape, Point p);
}
