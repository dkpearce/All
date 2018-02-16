import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class WindowsXP implements ActionListener{
	JMenuItem item1, item2, item3, item4, item5;
	Calculations calc;
	
	public WindowsXP() {
		JFrame win = new JFrame("Windows-XP");
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("Maths");
		item1 = new JMenuItem("Addition");
		item2 = new JMenuItem("Subtraction");
		item3 = new JMenuItem("Multiplication");
		item4 = new JMenuItem("Division");
		item5 = new JMenuItem("Exit");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		item5.addActionListener(this);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menubar.add(menu1);
		
		win.setJMenuBar(menubar);
		win.setSize(400,400);
		win.setVisible(true);
		calc = new Calculations();
	}
	
	public void actionPerformed(ActionEvent E) {
		JMenuItem I = (JMenuItem) E.getSource();
		if(I==item1) {
			calc.ShowWindow("Addition");
		}
		if(I==item2) {
			calc.ShowWindow("Subtraction");
		}
		if(I==item3) {
			calc.ShowWindow("Multiplication");
		}
		if(I==item4) {
			calc.ShowWindow("Division");
		}
		if(I==item5) {
			System.exit(0);
		}
		
	}
}
