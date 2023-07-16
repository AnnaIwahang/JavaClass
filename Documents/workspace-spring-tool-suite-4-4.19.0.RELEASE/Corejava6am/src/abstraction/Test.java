package abstraction;

public class Test {
	public static void main(String[] args) {
		CentralBank b = new NabilBank();
		
		b.getBankName();
		b.getInterestRate();
		
		UserServiceImpl us = new UserServiceImpl();
		
		us.addUser();       //implementation hide(hidden)
		us.deleteUser();
		us.print();
		
		//CommonService cs = new UserServiceImpl();
		//cs.print();
		
		
		
	}

}
