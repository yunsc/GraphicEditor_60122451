package shapes;


import java.awt.Graphics2D;
import java.awt.Polygon;

import constants.CConstants.EDrawingType;

public class CPolygon extends CShape {
	private Polygon polygon;
	public CPolygon() {
		super(EDrawingType.NP);
		this.polygon = new Polygon();
	}
	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
		this.polygon.addPoint(x, y);
		this.polygon.addPoint(x, y);
	}
	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		g2D.draw(this.polygon);
		this.polygon.xpoints[polygon.npoints-1] = x;
		this.polygon.ypoints[polygon.npoints-1] = y;
		g2D.draw(this.polygon);	
	}
	@Override
	public void finishDrawing(int x, int y, Graphics2D g2D) {
	}
	public void continueDrawing(int x, int y, Graphics2D g2D){
		this.polygon.addPoint(x, y);
	}
	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.draw(this.polygon);
	}
}
