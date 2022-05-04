package collection;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		
		// HashMap을 사용해서 과목하고 성적 입력
		// 과목: 국어, 영어, 수학, 자바
		// <String, Integer>
		// key 객체를 사용해서 value를 출력해보자
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("국어", 90);
		map.put("영어", 75);
		map.put("수학", 65);
		map.put("자바", 100);
		
		int kor = map.get("국어");
		int eng = map.get("영어");
		int math = map.get("수학");
		int java = map.get("자바");
		
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("자바점수: " + java);

	}

}
