
public class VoucherCard {

    private float value;
    private String serialNumber;
	
	public VoucherCard() {
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setSerialNum(String num) {
        this.serialNumber = num;
    }

    public String getSerialNum() {
        return serialNumber;
    }

}