package MethodOverriding;


public class DemoOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Login sbi= new Login();
		sbi.loginForm();

		Login hdfc= new Login();
		hdfc.loginForm();
		}
	
}
	class Login {
		void loginForm() {
			System.out.println("Enter user name");
			System.out.println("Enter Password");
			System.out.println("Click Submit button");
			
			}
		
		class newLogin extends Login{
			void loginForm() {
				System.out.println("Enter user name");
				System.out.println("Enter Password");
				System.out.println("Mobile Number");
				System.out.println("Click Submit button");
				
			}
		}
	

	

}
	
