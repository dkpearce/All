import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventSum implements ActionListener {
	TextField text1;
	Float answer;
	Float secondNumber;
	Float firstNumber;
	String symbol;
	String opt;
	public void actionPerformed(ActionEvent x) {
		Button Btn = (Button)x.getSource();
		String symbol = Btn.getLabel();
		try {
		if(symbol == "C") {
			text1.setText("");
		}
		else if(symbol == "+") {
			opt = "+";
			firstNumber = Float.parseFloat(text1.getText());
			text1.setText("");
		}
		else if(symbol == "-") {
			opt = "-";
			firstNumber = Float.parseFloat(text1.getText());
			text1.setText("");
		}
		else if(symbol == "/") {
			opt = "/";
			firstNumber = Float.parseFloat(text1.getText());
			text1.setText("");
		}
		else if(symbol == "*") {
			opt = "*";
			firstNumber = Float.parseFloat(text1.getText());
			text1.setText("");
			
		}
		else if(symbol == "=") {
			secondNumber = Float.parseFloat(text1.getText());
			if(opt == "+") {
				answer = firstNumber + secondNumber;
				text1.setText(Float.toString(answer));
			}
			else if (opt == "-"){
				answer = firstNumber - secondNumber;
				text1.setText(Float.toString(answer));
			}
			else if(opt == "*") {
				answer = firstNumber * secondNumber;
				text1.setText(Float.toString(answer));
			}
			else if(opt == "/") {
				answer = firstNumber / secondNumber;
				text1.setText(Float.toString(answer));
			}
		}
		}
		catch(Exception E){
			text1.setText("Invalid Input");
		}
	}
	public EventSum(TextField a) {
		text1 = a;
	}
	
}