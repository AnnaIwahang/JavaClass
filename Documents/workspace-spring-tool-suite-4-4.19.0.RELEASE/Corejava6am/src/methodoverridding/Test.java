package methodoverridding;

public class Test {
	public static void main(String[] args) {
		
		//static or early binding of object
		NabilBank nb = new NabilBank();
		nb.getBankName();
		nb.getInterestRate();
		
		//upcasting
		//NMB b = new NMB();
		CentralBank b = new NMB();
		
	}
	
	//dynamic or late binding of object
    //runtime polymorphism 
	void printBankInfo(CentralBank b) {
		
		b.getBankName();
		b.getInterestRate();
		
	}

}
