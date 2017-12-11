
public class User {

    protected String userName, firstName, lastName, email, password, phoneNum, type;
	
	public User() {
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