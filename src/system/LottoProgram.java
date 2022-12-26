package system;

import java.util.Arrays;
import java.util.Scanner;

public class LottoProgram {

	private int[] lottoNum = new int[6];
	private int[] inputNum = new int[6];
	private int grade;
	private int count;

	private void inputNum() {
		System.out.println("> 1부터 45 사이의 6개 숫자를 입력하세요. (예: 1, 2, 3, 4, 5, 6) ");
		System.out.println("> ");

		Scanner scn = new Scanner(System.in);
		String input = scn.next();

		String[] inputArray = input.split(",");

		for (int i = 0; i < inputArray.length; i++) {
			inputNum[i] = Integer.parseInt(inputArray[i].trim());
		}

		Arrays.sort(inputNum);
		System.out.println("> " + Arrays.toString(inputNum));
		scn.close();
	}

	private void createLottoNum() {
		while (true) {
			int lottoNo = (int) (Math.random() * 45) + 1;

			int i=0;
			for (i = 0; i < lottoNum.length; i++) {
				if (lottoNum[i] == lottoNo) 
					break;
				if (lottoNum[i] == 0) {
					this.lottoNum[i] = lottoNo;
					break;
				}
			}
			if (i == lottoNum.length)
				break;

		
			}
		
	}

	private void setGrade() {
		for (int i = 0; i < lottoNum.length; i++) {
			for (int l = 0; l < inputNum.length; l++) {
				if (lottoNum[i] == inputNum[l]) {
					count++;
				}
			}
		}

		grade = 0;
		if (count == 6) {
			grade = 1;
		} else if (count == 5) {
			grade = 2;
		} else if (count == 4) {
			grade = 3;
		}
	}

	private void printGrade() {
		Arrays.sort(lottoNum);
		System.out.println("> " + Arrays.toString(lottoNum));

		if (grade == 0) {
			System.out.printf("%d개가 일치하므로 당첨되지 않았습니다.", count);
		} else {
			System.out.printf("%d개가 일치하므로 %d등에 당첨되었습니다", count, grade);
		}
	}

	public static void main(String[] args) {

		LottoProgram lp = new LottoProgram();
		lp.inputNum();
		lp.createLottoNum();
		lp.setGrade();
		lp.printGrade();

	}
}