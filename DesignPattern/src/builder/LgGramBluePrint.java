package builder;

public class LgGramBluePrint extends BluePrint {

	private String cpu;
	private String ram;
	private String storage;

	@Override
	public void setCpu() {
		cpu = "i7";
	}

	@Override
	public void setRam() {
		ram = "8g";
	}

	@Override
	public void setStorage() {
		storage = "256g ssd";
	}

	@Override
	public Computer getComputer() {
		return new Computer(cpu, ram, storage);
	}

}
