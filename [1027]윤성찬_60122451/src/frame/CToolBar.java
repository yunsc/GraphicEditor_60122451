package frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import constants.CConstants.EToolBarButton;

public class CToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	// association	
	private CDrawingPanel drawingPanel;
	public void setDrawingPanel(CDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
	}
	
	public CToolBar() {
		ButtonGroup buttonGroup = new ButtonGroup();
		ActionHandler actionHandler = new ActionHandler();
		
		for (EToolBarButton eToolBarButton: EToolBarButton.values()) {
			JRadioButton button = new JRadioButton();
			//attributes of components
			button.setIcon(new ImageIcon(eToolBarButton.getIconName()));
			button.setSelectedIcon(new ImageIcon(eToolBarButton.getSelectedIconName()));
			this.add(button);
			buttonGroup.add(button);
			button.addActionListener(actionHandler);
			button.setActionCommand(eToolBarButton.toString());				
		}
	}
	public void initialize() {
		JRadioButton button = (JRadioButton) this.getComponentAtIndex(EToolBarButton.rectangle.ordinal());
		button.doClick();
	}
	public class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			drawingPanel.setSelectedShape(
					EToolBarButton.valueOf(e.getActionCommand()).getShape());
		}
	}
	
}
