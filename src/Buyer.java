
public class Buyer extends User {
	private String address;
	private VoucherCard voucherCard;
	private CreditCard creditCard;
	private Cart cart;

	public Buyer(String userName, String firstName, String lastName, String email, String password, String phoneNum) {
		super(userName, firstName, lastName, email, password, phoneNum);
		cart = new Cart();
	}

	public Buyer() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Buyer(User user) {
		super(user);
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

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}