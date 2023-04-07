package DefaultPkg;
import java.util.NavigableMap;
//date 4/4/2023
import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap tm= new TreeMap<>();
		tm.put(1010,  "ajay");
		tm.put(1008,  "tom");
		tm.put(1009,  10);
		tm.put(1005,  "bob");
		
		//to print in descending order
		NavigableMap<Integer, Object> nm= tm.descendingMap();
		
		
		System.out.println(tm);
		System.out.println(nm);
		
	}

}
