package superInjava;
//date 3/8/2023//missed some matter
public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.printData();
System.out.println(b.a);
	}

}

class A{//parent base and super class
	int a=30;
	}
class B extends A{//child derived subclass class
	int a=10;
	
	void print() {
		System.out.println("a="+super.a);
	}

	public void printData() {
		// TODO Auto-generated method stub
		
	}
}
class C extends B{
	int a=20;
	public void printData(){
	System.out.println("a="+a);
}
}