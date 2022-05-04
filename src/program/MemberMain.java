package program;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		MemberService service = new MemberServiceImpl();
		
		while(true) {
			
			System.out.println("=========== 회원 관리 프로그램 ===========");
			System.out.println(" 1.화원목록 2.회원조회 3.회원등록 ");
			System.out.println(" 4.회원수정 5.회원삭제 6.종료 ");
			System.out.println("======================================");
			System.out.print("메뉴입력: ");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1 :
				service.list();
				break;
			case 2 :
				service.memberView();
				break;
			case 3 :
				service.insert();
				break;
			case 4 :
				service.edit();
				break;
			case 5 :
				service.delete();
				break;
			case 6 :
				System.out.println("회원관리 프로그램을 종료합니다.");
				System.exit(0);
				default :
					System.out.println("잘못 입력 하였습니다.");
			}
		}
	}

}
