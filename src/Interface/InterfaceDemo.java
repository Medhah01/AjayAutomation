package Interface;
//date 3/7/2023
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
user u = new user();
u.addUser();
u.deleteUser();
u.editUser();
	}

}

interface A{
	 int a=10;
	void addUser();
	void deleteUser();
	void editUser();
	
}
class user implements A{

	@Override
	public void addUser() {
		System.out.println("this is add user method");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("this is delete user method");
		
	}

	@Override
	public void editUser() {
		System.out.println("this is edit user method");
		
	}
	
}