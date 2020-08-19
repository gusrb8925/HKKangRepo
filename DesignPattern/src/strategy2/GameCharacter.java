package strategy2;

//스트레티지 패턴: 추상적인 접근점(인터페이스)를 만들어 접근점에서 교환가능
public class GameCharacter {
	// 접근점
	private Weapon weapon;

	// 교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
		} else {
			// 델리게이트
			weapon.attack();
		}

	}

}
