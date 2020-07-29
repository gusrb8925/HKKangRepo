package section07;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-1장: 상속(Inheritance) 1
//모든클래스는 생성자를 가진다.
//사용자가 생성자 메서드를 안만들면 기본적으로 생성자 메서드를 제공한다.
public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;

	// 사용자가 생성자를 안만들면 제공하는 no-parameter생성자
	// public Computer() {
	// }

	// 생성자 메서드
	public Computer(String man, String proc, int ram, int disk, double speed) {
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = speed;
	}

	public double computerPower() {
		return ramSize * processorSpeed;
	}

	public double getRamSieze() {
		return ramSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public double getDiskSize() {
		return diskSize;
	}

	public String toString() {
		String result = "Manufacturer: " + manufacturer + "\nCPU: " + processor + "\nRam: " + ramSize + "\nDisk: "
				+ diskSize;
		return result;
	}
}
