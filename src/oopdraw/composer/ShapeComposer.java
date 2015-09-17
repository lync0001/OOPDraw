package oopdraw.composer;
import java.awt.Point;

import oopdraw.shape.AbstractShape;

public interface ShapeComposer {
	public AbstractShape create(Point startPoint);
	public void expand(Point p);
	public void complete(Point p);
}
