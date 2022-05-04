package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex08 {

	public static void main(String[] args) {
		// HashMap을 사용해서 아이디와 비밀번호 입력
		// <String, String>
		// keySet 메소드로 key값 들을 Set 타입으로 반환받고
		// Interator를 사용해서 아이디와 비밀번호 출력하기
		
		Map<String, String> map = new HashMap<>();
		
		map.put("hong", "1234");
		map.put("kang", "4321");
		map.put("choi", "5678");
		map.put("kim", "8765");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			String id = keyIter.next();
			
			String pw = map.get(id);
			
			System.out.println("아이디: " + id + "|| 비밀번호: " + pw);
		}
		

	}

}
