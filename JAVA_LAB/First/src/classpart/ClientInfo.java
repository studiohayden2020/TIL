package classpart;

public class ClientInfo {
	
	private static final boolean True = false;
	int age;
	String name;
	boolean marry;
	int children;
	
	public String getClientName() {
		return name;
	}

	public static void main(String[] args) {
		ClientInfo clientJames = new ClientInfo();
		clientJames.name = "James";
		clientJames.age = 40;
		clientJames.marry = true;
		clientJames.children = 3;
		
		System.out.println(clientJames.name);
		System.out.println(clientJames.getClientName());
		System.out.println(clientJames.age);
		System.out.println(clientJames.marry);
		System.out.println(clientJames.children);
	}

}
