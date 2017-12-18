
public class PremiumOwner extends StoreOwner {

	public PremiumOwner(String userName, String firstName, String lastName, String email, String password,
			String phoneNum) {
		super(userName, firstName, lastName, email, password, phoneNum);
	}

	public PremiumOwner(User register) {
		// TODO Auto-generated constructor stub
		super(register);
	}

	private CreditCard crediCard;

	public void setCreditCard(CreditCard crediCard) {
		this.crediCard = crediCard;
	}

	public CreditCard getCreditCard() {
		return crediCard;
	}
}