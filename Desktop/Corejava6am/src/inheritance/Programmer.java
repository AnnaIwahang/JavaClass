package inheritance;

public class Programmer extends Employee{
	
	String proLang;
	String project;
	int bonus;
	
	void print() {
		
		super.print();
		
		System.out.println("ProLang = "+proLang);
		System.out.println("Project = "+project);
		System.out.println("Bonus = "+bonus);
	}

}
