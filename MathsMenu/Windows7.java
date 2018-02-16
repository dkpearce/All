import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Windows7 {

	public static void main(String[] args) {
		JFrame win = new JFrame();
		JTextField T1 = new JTextField(10);
		JTextField T2 = new JTextField(10);
		JTextField T3 = new JTextField(10);
		JButton B1 = new JButton("+");
		JButton B2 = new JButton("-");
		JButton B3 = new JButton("/");
		JButton B4 = new JButton("*");
		
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int a,b,c;
				a=Integer.parseInt(T1.getText());
				b=Integer.parseInt(T2.getText());
				c=a+b;
				T3.setText(Integer.toString(c));
			}
		});
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int a,b,c;
				a=Integer.parseInt(T1.getText());
				b=Integer.parseInt(T2.getText());
				c=a-b;
				T3.setText(Integer.toString(c));
			}
		});
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int a,b,c;
				a=Integer.parseInt(T1.getText());
				b=Integer.parseInt(T2.getText());
				c=a/b;
				T3.setText(Integer.toString(c));
			}
		});
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int a,b,c;
				a=Integer.parseInt(T1.getText());
				b=Integer.parseInt(T2.getText());
				c=a*b;
				T3.setText(Integer.toString(c));
			}
		});

	}

}
