package Inheritance2;
//date 3/3/2023
public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B objB= new B();
objB.printData();
objB.showData();

C objc = new C();
objc.printData();
objc.showData();
objc.displayData();
System.out.println("a="+objc.a+" b="+objc.b+" c="+objc.a);
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