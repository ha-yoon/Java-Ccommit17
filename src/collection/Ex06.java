package collection;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(new Integer(1), new String("홍길동"));
		
		map.put(2,"성춘향");
		map.put(3,"이순신");
		map.put(4,"이몽룡");
		map.put(5,"홍길순");
		
		
		System.out.println("Map Entry: " + map.size());
		
		System.out.println(map);
		System.out.println(map.get(1)); 
		System.out.println(map.get(7)); 
		System.out.println();
		
		
		Set<Integer> keySet = map.keySet(); // key 객체를 Set 타입으로 변환
		
		Iterator<Integer> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			int key = keyIter.next();
			String value = map.get(key);
			System.out.println("key: " + key + " || value: " + value);
	
		}
		
		System.out.println();
		
		map.remove(1); 
		map.remove(2); 
		
		System.out.println(map);
		
		map. clear(); 
		
		if(map.isEmpty()) {
			
			System.out.println("요소가 없습니다.");
			
		}
		
		}

	

}

