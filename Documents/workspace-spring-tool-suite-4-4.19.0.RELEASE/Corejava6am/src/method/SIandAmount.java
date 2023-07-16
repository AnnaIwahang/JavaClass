package method;

public class SIandAmount {
	public static void main(String[] args) {
		int x = SimpleInterest();
		System.out.println("Simple Interest = "+x);
		area();
	}
	
	static int SimpleInterest() {
		int p = 12;
		int t = 20; 
		int r = 80;
		
		int si = (p*t*r)/100;
		
		return si;
	}
	
	static void area() {
		int l = 2;
		int w = 3;
	
		int a = l*w;
		
		System.out.println("Area = "+a);
	}
	

}
