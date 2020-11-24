package singleton;

public class Company {
	private static Company instance = new Company(); // 유일하게 생성한 instance
	private Company() {}	
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
	