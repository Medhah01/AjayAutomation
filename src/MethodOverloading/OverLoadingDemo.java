package MethodOverloading;
//date 3/6/2023
public class OverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 OverLoadingDemo obj= new OverLoadingDemo();
 int result=obj.add(10, 30, 40);
 System.out.println(result);
	}
 //or
	//System.out.println(obj.add(10, 30, 40)); 
	//}
int add(int a, int b) {
	return a+b;
}

int add(int a, int b, int c) {
	return a+b+c;
	}
int add(int a, int b, int c, int d) {
	return a+b+c+d;
	}
float add(float a, float b) {
	return a+b;
}
float add(float a, int b) {
	return a+b;
}
float add(int a, float b) {
	return a+b;
}
double add(double a, double b) {
	return a+b;
}
double add(double a, int b) {
	return a+b;
}





}







