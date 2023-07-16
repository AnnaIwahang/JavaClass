package Encapsulation;

public class Test {
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		/*c.id = 1212;
		c.name = "John";
		c.age = 15;
		c.city = "Ktm";*/
		
		c.setId(1212);
		c.setName("John");
		c.setAge(15);
		c.setCity("Ktm");
		
		System.out.println(c.toString());
		
		System.out.println("Id = "+c.getId());
		System.out.println("Name = "+c.getName());
		System.out.println("Age = "+c.getAge());
		System.out.println("City = "+c.getCity());
	}

}
