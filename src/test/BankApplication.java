package test;

import java.util.Scanner;

public class BankApplication {
	
	Account[] accounts = new Account[100];
	
	int showAndSelectMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
		System.out.println("선택> ");
		
		Scanner scn = new Scanner(System.in);
		int menu = scn.nextInt();
		
		return menu;
	}
	
	void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("계좌번호: ");
		String accountNo = scn.nextLine();
		System.out.println("계좌주: ");
		String name = scn.nextLine();
		System.out.println("초기입금액: ");
		int balance = scn.nextInt();
		
		
		Account account = new Account(accountNo, name, balance);
		for(int i=0; i<this.accounts.length; i ++) {
			if(this.accounts[i] == null) {
				this.accounts[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			} 
		} 
	}
	
	void showAccounts() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(Account account : this.accounts) {
			if (account != null) {
				account.print();
			}
		}
	}

	void deposit() {
		System.out.println("--------");
		System.out.println("입금");
		System.out.println("--------");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("계좌번호: ");
		String accountNo = scn.nextLine();
		System.out.println("입금액: ");
		int balance = scn.nextInt();
		
		for(Account account : this.accounts) {
			if(account != null && account.getAccountNo().equals(accountNo)) {
				account.deposit(accountNo, balance);
			}
		}
		
	}
	
	void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("계좌번호: ");
		String accountNo = scn.nextLine();
		System.out.println("출금액: ");
		int balance = scn.nextInt();
		
		for(Account account : this.accounts) {
			if(account != null && account.getAccountNo().equals(accountNo)) {
				account.withdraw(accountNo, balance);
			}
		}
	}
		
	public static void main(String[] args) {
		BankApplication ba = new BankApplication();
		
		
		while(true) {
			int menu = ba.showAndSelectMenu();
			switch(menu) {
			case 1 :
				ba.createAccount();
				break;
			case 2 : 
				ba.showAccounts();
				break;
			case 3 : 
				ba.deposit();
				break;
			case 4 :
				ba.withdraw();
				break;
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
	
}
