package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {


		
		Set<String> set = new HashSet<>();
		
		set.add(new String("냥냥냥"));
		
		set.add("홍길동");
		set.add("이순신");
		set.add("장보고");
		set.add("멍멍이"); 
		
		System.out.println("Set 크기: " + set.size());
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			String str = setIter.next();
			System.out.println(str);
		}
		
		set.remove("홍길동"); 
		
		System.out.println(set.contains("홍길동"));
		
		
		setIter = set.iterator();
		 
		
		while(setIter.hasNext()) {
			String str = setIter.next();
			System.out.println(str);
		}
		
		set.clear(); 
		if(set.isEmpty()) {
		
			System.out.println("비어있음");
		}
	}

}
