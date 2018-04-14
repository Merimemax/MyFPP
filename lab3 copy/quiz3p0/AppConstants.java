package quiz3p0;

public enum AppConstants {

	YEAR(2012), GPA(3.4f), MIN_RANK(1), MAX_RANK(11);

	private int value;
	private float value2;

	AppConstants(int value) {
		this.value = value;
	}

	AppConstants(float value2) {
		this.value2 = value2;
	}

	public int getValue() {
		return value;
	}

	public float getValuef() {
		return value2;
	}
}
