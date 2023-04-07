package sample1;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticMethod sm=new StaticMethod();
		//sm.display();
		StaticMethod.show();
		
	}
    void display() {
	System.out.println("this is display method");
}
    static void show() {
   System.out.println("this is show method");
 }
}
