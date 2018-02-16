import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class BinaryLogic implements ActionListener {
	JTextField T1;
	JTextField T2;
	public BinaryLogic(JTextField a, JTextField b){
		T1 = a;
		T2 = b;
	}
	public void actionPerformed(ActionEvent E1) {
		Button Btn = (Button)E1.getSource();
		String action = Btn.getLabel();
		int number = Integer.parseInt(T1.getText());
		if(action.equals("Convert to Binary")){
			T2.setText("");
			for(int i=0; number>=1; i++) {
				int digit = number%2;
				T2.setText(Integer.toString(digit) + T2.getText());
				number = number/2;
			}
		}
		else if(action.equals("Convert to Decimal")) {
			int y = 0;
			int x;
			String a = T2.getText();
			T2.setText("");
			for(int i=a.length()-1, j=0; i>=0; i--, j++) {
				x =(int)Math.pow(2, j)*Integer.parseInt(a.substring(i, i+1));
				y =+ x;
			}
			T2.setText(Integer.toString(y));
		}
		
	}
}

