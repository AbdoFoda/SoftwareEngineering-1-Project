import java.util.ArrayList;
import java.util.List;

public class UserDB {

	private List<User> users = new ArrayList<User>();

	public UserDB() {
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void removeUser(String userName) {
		// TODO implement here
	}

	public void updateUser(String userName) {
		// TODO implement here
	}

	public User getUser(String userName) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserName().equals(userName)) {
				return users.get(i);
			}
		}
		return null;
	}

	public List<User> getAllUsers() {
		return users;
	}

}