package methodoverridding;

public class CentralBank {
	
	protected void getBankName() {
		System.out.println("Central Bank");
	}
	
	protected void getInterestRate() {
		System.out.println("0");
	}
	
	public void moneyExRate() {
		System.out.println("$1 = 132");
		System.out.println("Yen 10 = 10");
		System.out.println("Ic 100 = 160");
	}

}
