package pkg1;
//date 3/31/2023
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Map;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Object, Object> hm= new HashMap<>();
		
		hm.put(1001,  "tom");
		hm.put(1003,  "bob");
		hm.put(1002,100);
		hm.put("t001", null);
		hm.put(null,  'c');
		hm.put(1001, "Ajay");
		
		hm.replace(1003, "bob","abc");
		
		//using entrySet
		for(Map.Entry<Object, Object> eachEntry:hm.entrySet()){
		System.out.println(eachEntry.getKey()+"-001 "+eachEntry.getValue());
		
		//keySet
		for(Object eachKey: hm.keySet()) {
		System.out.println("key"+eachKey+"value"+hm.get(eachKey));
		
		//valueSet
		for(Object eachValue: hm.values()) {
			System.out.println("value"+eachValue);
		
			
			
		
			
			System.out.println(hm.get(1003));
		
		hm.remove("too1", null);
		hm.replace(1001, "Ajay");
		//hm.remove(1002);
		System.out.println(hm);
		
	}

}
}
	}
}


