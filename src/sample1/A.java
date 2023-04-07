package sample1;
//date-2/28/2023
//Constructor is used to execute some business logic as soon as object get created.

public class A {
	A(){// default 0 args
		System.out.println("this is class A constructor");
		
	}
    A (int a){
    	System.out.println("a="+a);
	System.out.println("this is 1 args constructor with int value");
}
    //if int and long are given. it will execute only int by default and not long
    A (long a){
    	System.out.println("a="+a);
	System.out.println("this is 1 args constructor with long value");
}
    A (short a){
    	System.out.println("a="+a);
	System.out.println("this is 1 args constructor with short value");
    }
    A (String a){
    	System.out.println("a="+a);
	System.out.println("this is 1 args constructor with short value");
    }
    
    
    A (float a){
    	System.out.println("a="+a);
	System.out.println("this is 1 args constructor");
}
    A (int a, int b){
	System.out.println("this is 2 args constructor");
}
    A (int a, float b, int c){
	System.out.println("this is 3 args constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a=new A();//object is created
		A a1=new A(10);// this line is calling 1 arg constructor
		A a2=new A(10.30f);// this line is calling 1 arg constructor
		A a3=new A(10,20); // this line is calling 2 arg constructor
		A a4=new A(10,20.30f,20); // this line is calling 3 arg constructor

		A a5= new A((short)10);
		A a6= new A("scriptqa");
		A a7= new A((long)10);
		
System.out.println("end of main");
	}

}
