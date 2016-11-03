package shapes;

import java.awt.Graphics2D;

import constants.CConstants.EDrawingType;

public class CLine extends CShape {
	private int x1, y1, x2, y2;
	public CLine() {
		super(EDrawingType.TP);
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
	}
	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
		this.x1 = x;
		this.y1 = y;		
		this.x2 = x;
		this.y2 = y;
	}
	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		g2D.drawLine(x1, y1, x2, y2);
		this.x2 = x;
		this.y2 = y;
		g2D.drawLine(x1, y1, x2, y2);
	}
	public void continueDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void finishDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void draw(Graphics2D g2D) {
		g2D.drawLine(x1, y1, x2, y2);
	}
}
