package constructor;

public class User {
	//instance variable
	String userName;
	String password;
	
	//=========== Default Constructor ==============
//	User(){
//		userName = "test";
//		password = "1234";
//	}	
	
	//=========== Parameterized Constructor =============
	//this(); calling default constructor
	//this(args); calling parameterized constructor
	
	User(String un, String psw){
	    this.userName = un;
	    this.password = psw; //calling instance variable 
	    
	    //this.printUser(); //calling instance method
	    
	    /*
	     * # 'this' keyword represents current object.
	     * # we can call instance variables, instance methods and constructors using this keyword.
	     * 
	     */
	}
	
	
	
		void printUser() {

		 System.out.println("UserName = "+userName);
		 System.out.println("Password = "+password);
		 
	 }
	 public static void main(String[] args) {
		 
		//User u = new User(); //constructor calling - Default constructor 
		User u = new User("Anna", "9999"); 
		u.printUser();
		
	}

}
