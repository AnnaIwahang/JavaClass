package interface_package;


public class Main {
	public static void main(String[] args) {
		UserService us = new UserServiceImpl();
		
		us.addUser();
		us.deleteUser();
		us.print();
		
		
		
	}

}
