package NumberBook;

import java.util.Scanner;

public class AdressBookv2 {

	private static Person[] persons = new Person[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isRun = true;
		while (isRun) {
			showMenu();

			switch (scan.nextInt()) {
			case 1:
				regist();
				break;
			case 2:
				show();
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			case 5:
				isRun = false;
				break;
			}
		}

		System.out.println("프로그램을 종료합니다.");

	}

	private static void regist() {
		System.out.println("----");
		System.out.println("등록");
		System.out.println("----");

		System.out.print("이름: ");
		String name = scan.next();

		System.out.print("전화번호: ");
		String phoneNo = scan.next();

		System.out.print("학생여부: ");
		String studentYn = scan.next();
		studentYn = studentYn.trim().toUpperCase();

		Person person = null;

		if (studentYn.equals("Y")) {
			System.out.print("학번:");
			String studentNo = scan.next();

			person = new Student(name, phoneNo, studentNo);

		} else {
			System.out.println("사번: ");
			String workNo = scan.next();

			person = new Worker(name, phoneNo, workNo);
		}

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				persons[i] = person;
				break;
			}
		}

	}

	private static void show() {
		System.out.println("----");
		System.out.println("조회");
		System.out.println("----");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				persons[i].print();
			}
		}
	}

	private static void modify() {
		System.out.println("----");
		System.out.println("수정");
		System.out.println("----");

		System.out.print("이름: ");
		String name = scan.next();

		System.out.print("전화번호: ");
		String phoneNo = scan.next();

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i].setPhone(phoneNo);
				System.out.println("결과> 정상적으로 수정되었습니다.");
				break;
			}

		}
	}

	private static void delete() {
		System.out.println("----");
		System.out.println("삭제");
		System.out.println("----");

		System.out.print("이름: ");
		String name = scan.next();

		System.out.print("전화번호: ");
		String phoneNo = scan.next();

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i] = null;
				System.out.println("결과> 삭제되었습니다.");
				break;
			}
		}

	}

	private static void showMenu() {
		System.out.println("----------------------------------");
		System.out.println("1.등록|2.조회|3.수정|4.삭제|5.종료");
		System.out.println("----------------------------------");
		System.out.println("선택> ");
	}
}
