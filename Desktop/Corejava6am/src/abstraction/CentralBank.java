package abstraction;

//add abstract in class for abstract class
public abstract class CentralBank {   
	
	protected abstract void getBankName();
	
	protected abstract void getInterestRate();
	
	public void moneyExRate() {
		System.out.println("$1 = 132");
		System.out.println("Yen 10 = 10");
		System.out.println("Ic 100 = 160");
	}

}
