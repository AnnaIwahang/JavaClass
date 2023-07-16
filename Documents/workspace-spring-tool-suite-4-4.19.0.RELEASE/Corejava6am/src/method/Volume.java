//volume
package method;

public class Volume {
	public static double calculateVolume(double area, double height) {
		double volume = area * height;
		System.out.println("Area: "+area);
		System.out.println("Volume: "+volume);
		return volume;
	}
	public static void main(String[] args) {
		double area = 2.3;
		double height = 4.3;
		
		calculateVolume(area, height);
	}
}
