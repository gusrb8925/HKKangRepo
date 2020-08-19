package builder;

//복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
public class Main {
	public static void main(String[] args) {

		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBluePrint());
		factory.make();
		Computer computer = factory.getComputer();

		System.out.println(computer.toString());

	}

}
