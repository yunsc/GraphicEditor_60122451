package constants;

import shapes.CEllipse;
import shapes.CShape;
import shapes.CLine;
import shapes.CPolygon;
import shapes.CRectangle;

public class CConstants {
	public final static int MAINFRAME_X = 100;
	public final static int MAINFRAME_Y = 100;
	public final static int MAINFRAME_W = 400;
	public final static int MAINFRAME_H = 600;
	
	public final static String MAINFRAME_TITLE = "GraphicsEditor";
	public final static String FILEMENU_TITLE = "File";
	public final static String EDITMENU_TITLE = "Edit";

	public static enum EMainFrame{
		X(100),	Y(100),	W(400),	H(600);
		private int value;
		private EMainFrame(int value){
			this.value = value;
		}
		public int getValue(){return this.value;}
	}
	public static enum EFileMenuItem{
		newItem("new"),
		open("open"),
		close("close"),
		save("save"),
		saveAs("saveAs"),
		print("print"),
		exit("exit");
		private String text;
		private EFileMenuItem(String text){
			this.text = text;
		}
		public String getText(){return this.text;}
		
	}
	public static enum EEditMenuItem{
		cut("cut"),
		copy("copy"),
		paste("paste"),
		delete("delete"),
		redo("redo"),
		undo("undo"),
		group("group"),
		ungroup("ungroup");
		private String text;
		private EEditMenuItem(String text){
			this.text = text;
		}
		public String getText(){return this.text;}
	}
	public static enum EDrawingType{
		TP, NP;
	}
	public static enum EToolBarButton{
		rectangle("img/rectangle.gif","img/rectangleSLT.gif", new CRectangle()),
		ellipse("img/ellipse.gif","img/ellipseSLT.gif",new CEllipse()),
		line("img/line.gif","img/lineSLT.gif",new CLine()),
		polygon("img/polygon.gif","img/polygonSLT.gif", new CPolygon());
		private String iconName;
		private String selectedIconName;
		private CShape shape;
		
		private EToolBarButton(String iconName,  String selectedIconName, CShape shape){
			this.iconName = iconName;
			this.selectedIconName = selectedIconName;
			this.shape = shape;
		}
		public String getIconName(){ return this.iconName;}
		public String getSelectedIconName(){ return this.selectedIconName;}
		public CShape getShape(){return this.shape;}
	}
	
	
}