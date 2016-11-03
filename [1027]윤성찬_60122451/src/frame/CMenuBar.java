package frame;

import javax.swing.JMenuBar;

import menus.CEditMenu;
import menus.CFileMenu;

public class CMenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	
	public CMenuBar(){		
		CFileMenu fileMenu = new CFileMenu();
		this.add(fileMenu);
		CEditMenu editMenu = new CEditMenu();
		this.add(editMenu);
	}

	public void initialize() {
		// TODO Auto-generated method stub
	}
}
