
public class Mycreator {

	Mycreator() {
		System.out.println("난 기본적으로 메모리올라갈때 실행되는 생성자 함수");
	}

	Mycreator(String pName) {
		System.out.println(pName + "난 기본적으로 메모리올라갈때 실행되는 생성자 함수");
	}

	private String name;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
