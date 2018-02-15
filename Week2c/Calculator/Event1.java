import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 implements ActionListener {
	TextField text1;
	TextField text2;
	TextField text3;
	Float answer;
	Float secondNumber;
	Float firstNumber;
	String calculation;
	String symbol;
	public void actionPerformed(ActionEvent x) {
		if(symbol == "+") {
			firstNumber = Float.parseFloat(text1.getText());
			text3.setText(symbol);
			text2.setText(Float.toString(firstNumber));
			text1.setText("");
		}
		else if(symbol == "-") {
			firstNumber = Float.parseFloat(text1.getText());
			text3.setText(symbol);
			text2.setText(Float.toString(firstNumber));
			text1.setText("");
		}
		else if(symbol == "/") {
			firstNumber = Float.parseFloat(text1.getText());
			text3.setText(symbol);
			text2.setText(Float.toString(firstNumber));
			text1.setText("");
		}
		else if(symbol == "*") {
			firstNumber = Float.parseFloat(text1.getText());
			text3.setText(symbol);
			text2.setText(Float.toString(firstNumber));
			text1.setText("");
			
		}
		else if(symbol == "=") {
			secondNumber = Float.parseFloat(text1.getText());
			if(text3.getText() == "+") {
				firstNumber = Float.parseFloat(text2.getText());
				answer = firstNumber + secondNumber;
				text1.setText(Float.toString(answer));
			}
			else if (text3.getText() == "-"){
				firstNumber = Float.parseFloat(text2.getText());
				answer = firstNumber - secondNumber;
				text1.setText(Float.toString(answer));
			}
			else if(text3.getText() == "*") {
				firstNumber = Float.parseFloat(text2.getText());
				answer = firstNumber * secondNumber;
				text1.setText(Float.toString(answer));
			}
			else if(text3.getText() == "/") {
				firstNumber = Float.parseFloat(text2.getText());
				answer = firstNumber / secondNumber;
				text1.setText(Float.toString(answer));
			}
		}
	}
	public Event1(TextField a, TextField b, String c, TextField d) {
		text1 = a;
		text2 = b;
		symbol = c;
		text3 = d;
	}
	
}
