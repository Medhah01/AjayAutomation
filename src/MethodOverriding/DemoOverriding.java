package MethodOverriding;

public class DemoOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A a= new A();
    a.add(10, 20);

	}
}


class A{
	void add(int a, int b) {
		System.out.println("class a add "+(a+b));
	}
}
class B extends A{
	void add(int a, int b) {
		System.out.println("class b add "+(a+b));
   }
}
   
	





