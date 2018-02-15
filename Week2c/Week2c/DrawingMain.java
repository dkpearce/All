
public class DrawingMain {

	public static void main(String[] args) {
		Line L = new Line();
		drawSomething(L);

	}
	public static void drawSomething(Drawing X) {
		X.Draw();
		X.hello();
	}

}
