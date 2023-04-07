package sample1;

public class ObjectInJava {

	String studentName;
	int rollNumber;
	void setData(String studentName1,int rollNumber1){
         studentName=studentName1;
         rollNumber=rollNumber1;
	}
	void printData(){
		System.out.println("Name="+studentName+" rollNumber="+rollNumber);
}
}
