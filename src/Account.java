
public class Account {
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	// 필드의 값을 설정하는 메서드 -> Setter
	// Setter의 규칙: 리턴 타입은 항상 void, 매개 변수는 항상 필드의 타입 이름이 동일
	public void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
	// 필드의 값을 가지고 가는 메서드 -> Getter
	public int getBalance() {
		return this.balance;
	}
	
	
	
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " +account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " +account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " +account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " +account.getBalance());
	}
}
