package sec02.exam03;

public interface InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); catch (InterruppedException e) {}
		
		thread.interrupt();
		}
	}

}
