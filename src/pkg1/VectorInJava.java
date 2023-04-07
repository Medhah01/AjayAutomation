package pkg1;
//date 3/29/2023
import java.util.ArrayList;
import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1= new ArrayList<>();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		
		
		
		
		Vector v= new Vector<>();
		//v.addElement(v);
		v.addElement(10);
		v.addElement("tom");
		v.addElement('c');
		v.addElement(null);
		v.addElement(10.10f);
		v.addElement(true);
		v.addElement(10);
		v.addElement(200);
		v.addElement(300);
		v.addElement(200);
		System.out.println(v);
		v.removeAll(a1);
		
		for(Object obj:v) {
			System.out.println(obj);
		}
		
		v.add(2, 20);
		v.addAll(3,a1);
		
		
		//System.out.println(v.contains(30));
		//System.out.println(v.contains(20));
		
		//System.out.println(v);
		//System.out.println(a1);
		
		
	}

}
