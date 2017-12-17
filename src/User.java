public class User {

	protected String userName, firstName, lastName, email, password, phoneNum;

	public User(String userName, String firstName, String lastName, String email, String password, String phoneNum) {
		this.userName = userName;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
	}

	public User(User rhs) {
		this.userName = rhs.userName;
		this.lastName = rhs.lastName;
		this.firstName = rhs.firstName;
		this.email = rhs.email;
		this.password = rhs.password;
		this.phoneNum = rhs.phoneNum;
	}

	public User() {
		userName = firstName = lastName = email = password = phoneNum = "";
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPhoneNum(String num) {
		this.phoneNum = num;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

}