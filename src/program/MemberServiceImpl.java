package program;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService {

	private Scanner scan = new Scanner(System.in);
	private ArrayList<Member> list = new ArrayList<>();
	
	@Override
	public void list() {
		// 회원 목록 출력
		
		for(int i = 0; i < list.size(); i++) {
			
			Member member = list.get(i);
			member.profileInfo(); 
		}
		
	}

	@Override
	public void memberView() {
		// 회원의 이름을 입력받아 해당 회원의 나이와 전화번호 출력 
		
		System.out.print("조회할 회원님의 이름: ");
		String name = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			
			Member view = list.get(i);
			
			if(view.getName().equals(name)) {
				
				System.out.println(name + "회원님의 나이: " + view.getAge());
				System.out.println(name + "회원님의 연락처: " + view.getPhoneNum());
				return;
			}
		}
		System.out.println(name + "회원님은 저희 회원이 아닙니다. 재확인 바랍니다.");
		
	}

	@Override
	public void insert() {
		// 회원의 이름, 나이, 전화번호를 입력받아 회원등록 
		
		System.out.print("이름: ");
		String name = scan.next();
		
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		System.out.print("연락처: ");
		String phoneNum = scan.next();

		list.add(new Member(name, age, phoneNum));
		
		System.out.println(name + "회원등록이 완료 되었습니다.");
	}

	@Override
	public void edit() {
		// 회원의 이름을 입력받아 해당 회원의 나이와 전화번호 수정 
		
		System.out.print("수정할 회원 이름: ");
		String name = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			
			Member edit = list.get(i);
			
			if(edit.getName().equals(name)) {
				
				System.out.println(name + "회원님의 나이는: " + edit.getAge() + "살 입니다.");
				System.out.print("수정할 나이: ");
				int newAge = scan.nextInt();
				
				System.out.println(name + "회원님의 연락처는: " + edit.getPhoneNum() + "번 입니다.");
				System.out.print("수정할 연락처: ");
				String newPhoneNum = scan.next();
				
				edit.setAge(newAge);
				edit.setPhoneNum(newPhoneNum);
				System.out.println(name + "회원님의 나이와 연락처가 수정됐습니다.");
				return;
				
				
			}
			
		}
		
	}

	@Override
	public void delete() {
		// 회원의 이름을 입력받아 해당회원을 삭제
		
		System.out.print("삭제할 회원님의 이름: ");
		String name = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			
			Member del = list.get(i);
			
			if(del.getName().equals(name)) {
				
				list.remove(i);
				
				System.out.println(name + "회원님을 삭제하였습니다.");
				return;
			}
		}
		
		
	}

}
