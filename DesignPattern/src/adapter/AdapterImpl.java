package adapter;

public class AdapterImpl implements Adapter {

	private Math math;

	public AdapterImpl() {
		this.math = new Math();
	}

	@Override
	public Float twiceOf(Float f) {

		return math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 시작");
		return (float) math.half(f.doubleValue());
	}

}
