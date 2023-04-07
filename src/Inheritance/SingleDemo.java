package Inheritance;
//Date 3/3/2023

public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //A a=new A();
   //a.printData();
	//}
	B objB=new B();//child class object
	   objB.printData();//parent class method
	   objB.showData();//child class
	   objB.printMsg();//parent class
	   System.out.println("a="+objB.a+" b="+objB.b);//variable from  
	   
		}

}

class A{
	int a=20;
	void printMsg() {
		System.out.println("this is parent class");
	}
	
	void printData() {
	System.out.println("parent class print method a="+a);
	}
}
class B extends A{
	int b=30;
	void showData() {
	System.out.println("b="+b);
	}
	
}
