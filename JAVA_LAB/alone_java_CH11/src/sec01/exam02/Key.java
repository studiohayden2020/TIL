package sec01.exam02;

//hashCode() 메소드를 재정의하지 않음
public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	// hashCode() 메소드 재정의 추가
	@Override
	public int hashCode() {
		return number;
	}
}
