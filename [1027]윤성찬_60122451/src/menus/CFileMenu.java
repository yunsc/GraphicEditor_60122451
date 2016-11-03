package menus;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.CConstants;

public class CFileMenu extends JMenu {
	
	private static final long serialVersionUID = 1L;
	
	public CFileMenu(){
	
		super(CConstants.FILEMENU_TITLE);
	
		for(CConstants.EFileMenuItem eMenuItem: CConstants.EFileMenuItem.values()){
			JMenuItem menuItem = new JMenuItem(eMenuItem.getText());
			this.add(menuItem);
		}
		
	}

	
}
