package Constructor;
//2/28/2023

public class student0 {
	
	int rollNumber;
	String studentName;
	
	student0(String name, int rollNum){
		rollNumber=rollNum;
	    studentName=name;
	}
	
	void printData() {
		System.out.println("Name="+studentName+" rollNumber="+rollNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  student0 ajay=new student0("ajay",1001);
  ajay.printData();
  student0 ram= new student0("Ram", 1002);
  ram.printData();
  
	}

}
