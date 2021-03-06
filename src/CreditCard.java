
public class CreditCard {

	private String number;
	private String securityCode;
	private String expirationDate;

	public CreditCard(String number, String securityCode, String expirationDate) {
		this.number = number;
		this.securityCode = securityCode;
		this.expirationDate = expirationDate;
	}

	public void setNum(String num) {
		this.number = num;
	}

	public String getNum() {
		return number;
	}

	public void setCode(String code) {
		this.securityCode = code;
	}

	public String getCode() {
		return securityCode;
	}

	public void setDate(String date) {
		this.expirationDate = date;
	}

	public String getDate() {
		return expirationDate;
	}

}