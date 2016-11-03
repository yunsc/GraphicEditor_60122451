package shapes;

import java.awt.Graphics2D;

import constants.CConstants.EDrawingType;

abstract public class CShape {
	private EDrawingType eDrawingType;
	public EDrawingType geteDrawingType(){return eDrawingType;}
	
	public CShape(EDrawingType eDrawingType){
		this.eDrawingType = eDrawingType;
	}
	abstract public void draw(Graphics2D g2D);
	abstract public void initDrawing(int x, int y, Graphics2D g2D);
	abstract public void keepDrawing(int x, int y, Graphics2D g2D);
	abstract public void finishDrawing(int x, int y, Graphics2D g2D);
	abstract public void continueDrawing(int x, int y, Graphics2D g2D);
	public CShape clone() {
		try {
			return this.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
