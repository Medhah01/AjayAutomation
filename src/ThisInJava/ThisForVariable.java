package ThisInJava;
//date 3/2/2023
public class ThisForVariable {
	int a;
	int b;
	
	void setData(int a,int b) {
		this.a=a;
		this.b=b;
	    
		}
	void getData() {
		System.out.println("a="+a+" b="+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisForVariable t= new ThisForVariable();
		t.setData(20, 30);
		t.getData();
		
	}

}
