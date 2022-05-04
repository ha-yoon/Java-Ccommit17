package collection;

import java.util.*;


public class Ex02 {

	public static void main(String[] args) {
		// String 타입의 ArrayList를 생성한 후
		// 자신이 좋아하는 연예인 5명의 이름을 넣어보자
		// 이름을 향상된 for문과 일반 for문으로 출력해보자
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("박재범");
		list.add("안효섭");
		list.add("정일우");
		list.add("공유");
		list.add("김래원");
		
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			
			String name = list.get(i);
			
			System.out.println(i + " : " + name);
		}
	}

}
