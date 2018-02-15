import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventNumber implements ActionListener {
	TextField text1;
	public void actionPerformed(ActionEvent x) {
		Button Btn = (Button)x.getSource();
		text1.setText(text1.getText() + Btn.getLabel());
	}
	public EventNumber(TextField a) {
		text1 = a;
	}
}