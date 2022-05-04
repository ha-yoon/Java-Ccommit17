package collection;

import java.util.*;


public class Ex03 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("망고");
		list.add("딸기");
		list.add("파인애플");

		Iterator<String> iterator = list.iterator();
	
		
		while(iterator.hasNext()) {
			
			
			String str = iterator.next();  
			System.out.println(str);	
		}
		
		System.out.println();
		iterator = list.iterator();
		
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			iterator.remove();
		
		}
		
		System.out.println(list.isEmpty());
		
	}

}
