package system;

import java.io.IOException;

//System.in.read()		입력한 키의 코드값을 반환
//0~9		48~58
//A~Z		65~90
//a~z		97~122
//Enter	13, 10

public class InExample {

	public static void main(String[] args) throws IOException {

		int speed = 0;
		int keyCode = 0;

		while (true) {
			keyCode = System.in.read();
			if (keyCode != 13 && keyCode != 10) {
				if (keyCode == 49) {
					speed++;
				} else if (keyCode == 50) {
					speed--;
				} else if (keyCode == 51) {
					break;
				}
				System.out.println("현재 속도 = " + speed);
			}

		}

		System.out.println("프로그램 종료");

	}

}
