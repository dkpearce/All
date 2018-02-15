import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event15 implements ActionListener {
	TextField text1;
	public void actionPerformed(ActionEvent x) {
		text1.setText("");
	}
	public Event15(TextField a) {
		text1 = a;

	}
}
