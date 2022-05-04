package program;

public class Member {

	private String name;
	private int age;
	private String phoneNum;
	
	public Member(String name, int age, String phonenum) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void profileInfo() {
		System.out.println(name + " 회원 || " + age + "살 ||" + phoneNum + "번");
	}
	
	
	
}
