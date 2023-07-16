package oops;

public class TestClass {
	public static void main(String[] args) {
		//represent math book
		Book b = new Book();
		
		//if you use scanner this is the place for creating scanner
		
		b.id = 1212;
		b.name = "Math";
		b.author = "A.L";
		b.price = 2000;
		
		b.printBookInfo();
		
		Book b1 = new Book();
		
		b1.id = 2222;
		b1.name = "Java";
		b1.author = "M.P";
		b1.price = 3000;
		
		b1.printBookInfo();
	}

}
