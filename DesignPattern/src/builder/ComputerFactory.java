package builder;

public class ComputerFactory {

	// 설계도 소유
	private BluePrint print;

	public void setBlueprint(BluePrint print) {
		this.print = print;

	}

	// 설계도로 만들기
	public void make() {
		print.setCpu();
		print.setRam();
		print.setStorage();
	}

	// 만근거 가져오기
	public Computer getComputer() {
		return print.getComputer();
	}

}
