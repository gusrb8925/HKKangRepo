package singleton;

//싱글턴 패턴: 하나의 인스턴스만 생성하도록 구현 
public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;

	private SystemSpeaker() {
		volume = 5;
	}

	public static SystemSpeaker getInstance() {
		if (instance == null) {
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		} else {
			System.out.println("이미 생성");
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
