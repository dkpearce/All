import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BinaryConverter {

	public static void main(String[] args) {
		JFrame F = new JFrame();
		JTextField T1 = new JTextField(10);
		JTextField T2 = new JTextField(10);
		Button Btn = new Button("Convert to Binary");
		Button Btn2 = new Button("Convert to Decimal");
		
		F.setLayout(new FlowLayout());
		F.setSize(600, 100);
		
		BinaryLogic E = new BinaryLogic(T1,T2);
		Btn.addActionListener(E);
		Btn2.addActionListener(E);
		
		F.add(T1);
		F.add(Btn);
		F.add(Btn2);
		F.add(T2);
		
		F.setVisible(true);

	}

}
