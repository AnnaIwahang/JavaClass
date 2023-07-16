package methodoverridding;

public class NMB extends CentralBank{
	
	@Override
	protected void getBankName() {
		System.out.println("NMB");
	}
	
	@Override
	protected void getInterestRate() {
		System.out.println("18%");
	}

}
