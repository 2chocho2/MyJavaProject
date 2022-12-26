
class SpeedingException extends RuntimeException{
	SpeedingException() {}
	SpeedingException(String s) {
		super(s);
	}
}

class Car {
	final int MAX_SPEED = 100;
	int speed;
	
	void speedUp() {
		this.speed ++;
		System.out.println(this.speed);
		if(this.speed >= MAX_SPEED) {
			SpeedingException se = new SpeedingException("제한 속도 초과");
			throw se;
		}
		
	}
	
	void speedDown() {
		this.speed -= 10;
		System.out.println("감속");
	}
}

public class ExceptionTest {

	public static void main(String[] args) {
	
		Car c = new Car();
		for(int i = 0; i < 1000; i++) {
			try {
				c.speedUp();
			} catch(SpeedingException se) {
				System.out.println(se.getMessage());
				c.speedDown();
			}
			
		}
		
		
	}
	
}

