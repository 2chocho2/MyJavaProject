package test;

public class MemberService {

	String id;
	String password;

	boolean login(String id, String password) {
		this.id = id;
		this.password = password;

		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	} 

	void logout(String id) {
		System.out.println(this.id+"님이 로그아웃 되었습니다.");
	}
}
 
