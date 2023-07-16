package objectwithmethod;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		
		Test t = new Test();
		Product p = t.getProductData();
		t.printProduct(p);
		
	}
	
	//============ Object as parameter ============
	void printProduct(Product p) {
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getCompany());
		
	}
	
	//======= Object as return type ===========
	Product getProductData() {
		
		Product p = new Product();
		
		p.setId(1122);
		p.setName("Mobile");
		p.setCompany("Nokia");
		p.setPrice(100);
		
		return p;
	}

}
