package pkg1;
//date 3/29/2023

import java.util.LinkedList;

public class LinkedList1 {
	static LinkedList ll = new LinkedList<>();
	
	public static void main(String args) {
		
		ll.add(10);
		ll.add("tom");
		ll.add(10.30f);                                 
		ll.add('c');
		ll.add(10);
		ll.add(true);
		ll.add(null);
		
		
		ll.add(2, "bob");
		ll.addFirst("ajay");
		ll.addLast(1234);
		System.out.println(ll.poll());
		
		System.out.println(ll);
	}


	

	
}




