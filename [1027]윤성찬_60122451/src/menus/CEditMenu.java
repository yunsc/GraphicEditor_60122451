package menus;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.CConstants;

public class CEditMenu extends JMenu {
	
	private static final long serialVersionUID = 1L;

	public CEditMenu(){
		
		super(CConstants.EDITMENU_TITLE);
		
		for(CConstants.EEditMenuItem eMenuItem: CConstants.EEditMenuItem.values()){
			JMenuItem menuItem = new JMenuItem(eMenuItem.getText());
			this.add(menuItem);
		}
		
		
	}
}
