package method;

public class MethodTest {
	public static void main(String[] args) {
		
		sum();
		area();
		printTable(12);
		int x = getSumof1to100();
		System.out.println("Sum of 1 to 100 = "+ x);
		int y = getSumof2to200();
		System.out.println("Sum of 2 to 200 = "+ y);
		int sv = findSmallestValue(1200, 2345);
		System.out.println("Find smallest vale = "+sv);
		area();
		
	}
	
	//1.no return type with no arguments.(void - with no argument pass)
	static void sum() {
		int a = 1;
		int b = 2;
		
		int s = a + b;
		System.out.println("Total sum = "+s);
	}
	
	//area
	static void area() {
		int l = 500;
		int b = 600;
		
		int area = l * b;
		
		System.out.println("Area = "+area);
	}
	
	//2. no return type with arguments. (non-void with arguments)
	static void printTable(int n) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(n+ " X "+ i + " = "+(n*i));
		}
	}
	
	//3. return type with no arguments.
	static int getSumof1to100() {
		int s = 0;
		for(int i=1; i<=100; i++) {
			
			s = s + 1;
			
		}
		return s;
	}
	
	//sumof2to200
	
	static int getSumof2to200() {
		int p = 0;
		for(int q=2; q<=200; q++) {
			p = p + 2;
		}
		return p;
	}
	
	//4. return type with arguments.
	static int findSmallestValue (int x, int y) {
		if(x<y) {
			return x;
		}
		return y;
	}
	
	//find area and volume
	static void getArea() {
		int l = 20;
		int b = 40;
		int a = l* b;
		
		System.out.println("Area = "+ a);
		
	}
	

	

}
