
public class Buyer extends User {

    private String address;
    private VoucherCard voucherCard;
    private CreditCard creditCard;
	
	public Buyer() {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setVoucherCard(VoucherCard vCard) {
        this.voucherCard = vCard;
    }

    public VoucherCard getVoucherCard() {
        return voucherCard;
    }

    public void setCreditCard(CreditCard cCard) {
        this.creditCard = cCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

}