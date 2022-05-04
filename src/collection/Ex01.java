package collection;

import java.util.*;


public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		// List: 데이터를 일렬로 늘어놓은 자료구조

		
		list.add(new String("홍길동1"));
	
		list.add("홍길동2");
		list.add("홍길동3");
		
		int size = list.size(); 
		
		System.out.println("총 객체 수: " + size);
		
		for(String str : list) { 
			System.out.println(str);
		}
		System.out.println();
		
		list.add(0, "이순신"); 
		list.add(2,"장보고"); 
		
		list.set(0,  "신사임당");
		
		String str = list.get(2);
		System.out.println("2: " + str);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			
			String str2 = list.get(i);
			System.out.println(i + " : " + str2);
		}
		System.out.println();
		
		list.remove(1); 
		list.remove("장보고"); 
		
		System.out.println(list.contains("장보고"));
	
		
		for(int i = 0; i < list.size(); i++) {
			
			String str2 = list.get(i);
			System.out.println(i + " : " + str2);
		}
		System.out.println();
		
		list.clear(); 
		
		System.out.println(list.isEmpty());
		
	}

}
