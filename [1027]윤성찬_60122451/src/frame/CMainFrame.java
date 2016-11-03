package frame;
import java.awt.BorderLayout;
import javax.swing.JFrame;

import constants.CConstants;
import constants.CConstants.EMainFrame;
// MainFrame specialize JFrame
public class CMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	//components
	private CMenuBar menuBar;
	private CToolBar toolBar;
	private CDrawingPanel drawingPanel;
	//constructor
	public CMainFrame() {
		// attribute initialization
		this.setTitle(CConstants.MAINFRAME_TITLE);
		this.setLocation(EMainFrame.X.getValue(), EMainFrame.Y.getValue());
		this.setSize(EMainFrame.W.getValue(), EMainFrame.H.getValue());
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//component creation & registration
		this.menuBar = new CMenuBar();
		this.setJMenuBar(menuBar);
		this.toolBar = new CToolBar();
		this.add(toolBar, BorderLayout.NORTH);
		this.drawingPanel = new CDrawingPanel();
		this.add(drawingPanel, BorderLayout.CENTER);
	}
	
	public void initialize() {
		// set associations among components
		toolBar.setDrawingPanel(this.drawingPanel);
		//component initialize
		menuBar.initialize();
		toolBar.initialize();
		drawingPanel.initialize();
		
	}
}
