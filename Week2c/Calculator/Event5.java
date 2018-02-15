import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event5 implements ActionListener {
	TextField text1;
	int number;
	public void actionPerformed(ActionEvent x) {
		text1.setText(text1.getText() + number);
	}
	public Event5(TextField a, int b) {
		text1 = a;
		number = b;

	}
}
