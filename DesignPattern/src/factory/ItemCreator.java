package factory;

public abstract class ItemCreator {

	// 팩토리 메서드 ->템플릿 메서드
	public Item create() {
		Item item;

		// step1
		requestItemsInfo();
		// step2
		item = createItem();
		// step3
		createItemLog();

		return item;
	}

	// 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다.
	protected abstract void requestItemsInfo();

	// 생성후 복제등 불법방지하기위해 DB에 아이템 생성정보를 남김.
	protected abstract void createItemLog();

	// 아이템을 생성하는 알고리즘
	protected abstract Item createItem();
}
