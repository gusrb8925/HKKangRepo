package factory;

import java.util.Date;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB에서 체력 회복 물약 정보 가져옴");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 회복 물약을 새로생성" + new Date());

	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
