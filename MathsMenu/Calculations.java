import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculations implements ActionListener {
	JTextField T1, T2, T3;
	JButton Btn;
	JFrame F;
	JLabel L1, L2, L3, Empty;
	public Calculations() {
	F = new JFrame();
	T1 = new JTextField(10);
	T2 = new JTextField(10);
	T3 = new JTextField(10);
	T1.setText("0");
	T2.setText("0");
	L1 = new JLabel("Number 1:");
	L2 = new JLabel("Number 2:");
	L3 = new JLabel("Answer:");
	Btn = new JButton("Get Result");
	Empty = new JLabel();
	F.setLayout(new GridLayout(4,2));
	Btn.addActionListener(this);
	F.add(L1);
	F.add(T1);
	F.add(L2);
	F.add(T2);
	F.add(Empty);
	F.add(Btn);
	F.add(L3);
	F.add(T3);
	F.setSize(400,400);
	}
	public void ShowWindow(String title) {
		F.setTitle(title);
		F.setVisible(true);
	}
	public void actionPerformed(ActionEvent E2) {
		int a,b,c;
		String T;
		a = Integer.parseInt(T1.getText());
		b = Integer.parseInt(T2.getText());
		T = F.getTitle();
		if(T.equals("Addition")){
			c=a+b;
			T3.setText(Integer.toString(c));
		}
		if(T.equals("Subtraction")){
			c=a-b;
			T3.setText(Integer.toString(c));
		}
		if(T.equals("Multiplication")){
			c=a*b;
			T3.setText(Integer.toString(c));
		}
		if(T.equals("Division")){
			c=a/b;
			T3.setText(Integer.toString(c));
		}
	}
}
