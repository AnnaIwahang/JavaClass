package abstraction;

public class UserServiceImpl implements UserService {

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void addUser() {
		System.out.println("Add User");
	}

	@Override
	public void deleteUser() {
		System.out.println("Delete user success");
	}

	
	

}
