package system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		System.out.println("운영체제: " + System.getProperty("os.name"));
		System.out.println("사용자 이름: " + System.getProperty("user.name"));
		System.out.println("사용자 홈 디렉토리 경로: " + System.getProperty("user.home"));


		Properties pros = System.getProperties();
		Set keys = pros.keySet();
		
		for(Object key : keys) {
			System.out.printf("%s: %s\n", (String)key, System.getProperty((String) key));
		}
	}
}
