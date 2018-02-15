
public class Results {
	private int phy, che, mat;
	private float total, per;
	public void showResults() {
		total = phy + che + mat;
		per = total * 100/450;
		
		if(phy>=90 && che>=90 && mat>=90) 
		{
			System.out.println("Marks:" + total);
			System.out.println("Per" + per);
		}
		else if(phy<=90 && che<=90 && mat<=90) 
		{
			System.out.println("Go Home");
		}
		else if(phy>=90 && che>=90 || phy>=90 && mat>=90 || che>=90 && mat>=90) 
		{
			System.out.println("Retake the exam");	
		}
		else{
			System.out.println("Retake the course");
		}

	}
	public void physics(int a) {
		if (a>=0 && a<=89) 
		{
			phy = a;
			System.out.println("Physics Exam Failed");
		}
		else if (a>=90 && a<=150)
		{
			phy = a;
		}
		else
		{
			System.out.println("Invalid physics marks");
		}
	}
	public void chemistry(int a) {
		if (a>=0 && a<=89) 
		{
			che = a;
			System.out.println("Chemistry Exam Failed");
		}
		else if (a>=90 && a<=150)
		{
			che = a;
		}
		else
		{
			System.out.println("Invalid chemistry marks");
		}
	}
	public void maths(int a) {
		if (a>=0 && a<=89) 
		{
			mat = a;
			System.out.println("Maths Exam Failed");
		}
		else if (a>=90 && a<=150)
		{
			mat = a;
		}
		else
		{
			System.out.println("Invalid maths marks");
		}	
	}
}
