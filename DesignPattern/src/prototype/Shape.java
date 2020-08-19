package prototype;

public class Shape implements Cloneable {// clone() 함수 사용가능

	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
