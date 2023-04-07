package Inheritance;
//date 3/2/2023
public class InheritanceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class parent{
	int a=30;
	int b=20;
	void print() {
		System.out.println("a="+a+" b"+b);
	}
}
class child extends parent{
	void getData() {
		System.out.println("a="+a);
				print();
		
	}
	
	
}