
public class VoucherCard {

	private double value;
	private String serialNumber;

	public VoucherCard(double value, String serialNumber) {
		this.value = value;
		this.serialNumber = serialNumber;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setSerialNum(String num) {
		this.serialNumber = num;
	}

	public String getSerialNum() {
		return serialNumber;
	}

}