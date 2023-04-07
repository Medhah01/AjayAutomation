package Inheritance3;
//date 3/3/2023
import Inheritance2.A;
import Inheritance2.B;

public class HierarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}









class A{
	int a=10;
	void printData() {
		System.out.println("a="+a);
	}
}

class B extends A{
	int b=20;
	void showData() {
		System.out.println("b="+b);
		
	}
 }
class C extends B{
	int c=30;
	void displayData() {
		System.out.println("c="+c);
	}
}