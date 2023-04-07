package Trycatch;
//date 3/13/2023
public class ThrowsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	void readData() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
