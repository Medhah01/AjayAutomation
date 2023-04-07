package sample1;

public class SwitchCase {

	private static final int Add = 0;
	private static final int Sub = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int option=4;
int a=20;
int b=10;
switch(option) {
// Remove break in between lines-it will print all options along with default case//
//("Add"+a+b); - will give Add2010//
case 1:
	System.out.println("Add" +(a+b));
	break;
case 2:
	System.out.println("Sub" +(a-b));
	break;
case 3:
	System.out.println("Mult" +(a*b));
	break;
case 4:
	System.out.println("Divide" +(a/b));
	break;
	default: System.out.println("Enter option 1 to 5");
	
}
}
	}


