package aggregration;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setColor("Black");
		c.setCompanyName("Tesla");
		c.setModel("TFX600");
		c.setPrice(1000000000);
		
		Employee emp = new Employee();
		
		emp.setId(8899);
		emp.setName("Anna Limbu");
		emp.setSalary(90000);
		emp.setOfficeName("Google");
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		
	}

}
