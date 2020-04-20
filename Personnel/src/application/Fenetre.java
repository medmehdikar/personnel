package application;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import personnel.GestionPersonnel;

public class Fenetre extends JFrame {
	
	GestionPersonnel gestionPersonnel;
	JTabbedPane t;
	JPanel p1,p2,p3;
	
	public Fenetre(GestionPersonnel gestionPersonnel){
		setTitle("Application Bureau");
		setSize(550, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		t = new JTabbedPane();
		/* p1, p2, p3 */

        
        t.setTabPlacement(JTabbedPane.TOP);
        t.setVisible(true);
        
        add(t);
		
		this.gestionPersonnel = gestionPersonnel;
	}
}
