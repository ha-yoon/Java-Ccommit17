package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Student 클래스를 만든다.
// 필드는 int studentId; String name; String department; 이다.
// 생성자의 매개변수로 매개 값을 받아 필드 초기화를 한다.
// profileInfo 메소드로 학번, 이름, 학과를 출력해보자 

class Student {
	
	int studentId; 
	String name; 
	String department;
	
	public Student(int studentId, String name, String department) {
		this.studentId = studentId;
		this.name= name;
		this.department = department;
	}
	
	public void profileInfo() {
		
		System.out.println("학번은" + studentId + "입니다.");
		System.out.println("이름은" + name + "입니다.");
		System.out.println("학과는" + department + "입니다.");
	}

}



public class Ex04 {

	public static void main(String[] args) {
	
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(202020, "홍길동", "컴퓨터공학과"));
		list.add(new Student(202021, "백종원", "식품학과"));
		list.add(new Student(202022, "이몽룡", "전자공학과"));
	
		// List안에 Student 객체의 학번 이름 학과들
		// 일반 for문 향상된 for문 그리고 Iterator를 사용해서 출력하기
		
		for(int i = 0; i < list.size(); i++) {
			
			Student stu= list.get(i);
			stu.profileInfo();
		}
		System.out.println();
		
		for(Student stu : list) {
			stu.profileInfo();
		}
		System.out.println();
		
		Iterator<Student> iter = list.iterator();
		
		while(iter.hasNext()) {
			
			Student stu = iter.next();
			stu.profileInfo();
		}
		
		
	}

}










