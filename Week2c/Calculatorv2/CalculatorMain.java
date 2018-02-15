import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalculatorMain {
	public static void main(String[] args) {

		Frame win = new Frame("Calculator2.0");
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		GridLayout G = new GridLayout(4,4);
		FlowLayout F = new FlowLayout();
		P1.setLayout(F);
		P2.setLayout(G);
		
		Button B1 = new Button("1");
		Button B2 = new Button("2");
		Button B3 = new Button("3");
		Button B4 = new Button("4");
		Button B5 = new Button("5");
		Button B6 = new Button("6");
		Button B7 = new Button("7");
		Button B8 = new Button("8");
		Button B9 = new Button("9");
		Button B10 = new Button("0");
		Button B11 = new Button("+");
		Button B12 = new Button("-");
		Button B13 = new Button("/");
		Button B14 = new Button("*");
		Button B15 = new Button("C");
		Button B16 = new Button("=");
		
		TextField T1 = new TextField(30);
		
		EventNumber E1 = new EventNumber(T1);
		EventSum E2 = new EventSum(T1);

		
		B1.addActionListener(E1);
		B2.addActionListener(E1);
		B3.addActionListener(E1);
		B4.addActionListener(E1);
		B5.addActionListener(E1);
		B6.addActionListener(E1);
		B7.addActionListener(E1);
		B8.addActionListener(E1);
		B9.addActionListener(E1);
		B10.addActionListener(E1);
		B11.addActionListener(E2);
		B12.addActionListener(E2);
		B13.addActionListener(E2);
		B14.addActionListener(E2);
		B15.addActionListener(E2);
		B16.addActionListener(E2);
		
		P1.add(T1);
		win.add(P1, "North");
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(B11);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(B12);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(B13);
		P2.add(B10);
		P2.add(B15);
		P2.add(B16);
		P2.add(B14);
		win.add(P2, "Center");
		
		win.setSize(400,600);
		win.setVisible(true);
	}
}
