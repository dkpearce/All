import java.util.ArrayList;

public class Person {

	private String name;
	private int age;
	private String job;
	
	static ArrayList<Person> personArray = new ArrayList<Person>();
	
	public static void main(String[] args) {
	
		Person tom = new Person();
		Person dick = new Person();
		Person harry = new Person();
		
	tom.setName("Tom");
	tom.setAge(25);
	tom.setJob("Manager");
	
	dick.setName("Dick");
	dick.setAge(32);
	dick.setJob("Salesman");
	
	harry.setName("Harry");
	harry.setAge(40);
	harry.setJob("Consultant");
	
	personArray.add(tom);
	personArray.add(dick);
	personArray.add(harry);
	
	for(int i=0; i<personArray.size(); i++) 
	{
		System.out.println(personArray.get(i));
	}
	findname("Tom"); 
	}
	static void findname(String nameSearch){
		for (Person person : personArray) {
			if (person.getName() == nameSearch) 
			{
				System.out.println("\n" + "Search Results:");
				System.out.println(person);
			}
			else 
			{
			}
		}
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public String toString() {
		return "Name:" + this.name + " Age:" + this.age + " Job:" + this.job; 
	}
	
}
