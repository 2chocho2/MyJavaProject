package NumberBook;

public class Worker extends Person {
	private String WorkerNo;

	public Worker(String name, String phoneNo, String workerNo) {
		super(name, phoneNo);
		this.WorkerNo = workerNo;
	}
	public String getWorkerNo() {
		return WorkerNo;
	}

	public void setWorkerNo(String workerNo) {
		WorkerNo = workerNo;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\n", super.getName(), super.getPhone(), getWorkerNo());
	}

	public void register() {
		System.out.println("사번: ");
	}
}
