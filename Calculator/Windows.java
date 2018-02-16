import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Windows {

	public static void main(String[] args) {

		Frame win = new Frame("Calculator");
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
		TextField T2 = new TextField();
		TextField T3 = new TextField();
		
		Event1 E1 = new Event1(T1, T2, "+", T3);
		Event1 E2 = new Event1(T1, T2, "-", T3);
		Event1 E3 = new Event1(T1, T2, "/", T3);
		Event1 E4 = new Event1(T1, T2, "*", T3);
		Event5 E5 = new Event5(T1, 1);
		Event5 E6 = new Event5(T1, 2);
		Event5 E7 = new Event5(T1, 3);
		Event5 E8 = new Event5(T1, 4);
		Event5 E9 = new Event5(T1, 5);
		Event5 E10 = new Event5(T1, 6);
		Event5 E11 = new Event5(T1, 7);
		Event5 E12 = new Event5(T1, 8);
		Event5 E13 = new Event5(T1, 9);
		Event5 E14 = new Event5(T1, 0);
		Event15 E15 = new Event15(T1);
		Event1 E16 = new Event1(T1, T2, "=", T3);
		
		B1.addActionListener(E5);
		B2.addActionListener(E6);
		B3.addActionListener(E7);
		B4.addActionListener(E8);
		B5.addActionListener(E9);
		B6.addActionListener(E10);
		B7.addActionListener(E11);
		B8.addActionListener(E12);
		B9.addActionListener(E13);
		B10.addActionListener(E14);
		B11.addActionListener(E1);
		B12.addActionListener(E2);
		B13.addActionListener(E3);
		B14.addActionListener(E4);
		B15.addActionListener(E15);
		B16.addActionListener(E16);
		
		P1.add(T1);
		win.add(P1, "North");
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(B10);
		P2.add(B11);
		P2.add(B12);
		P2.add(B13);
		P2.add(B14);
		P2.add(B15);
		P2.add(B16);
		win.add(P2, "Center");
		
		win.setSize(400,600);
		win.setVisible(true);
	}

}
