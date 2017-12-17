import java.util.Vector;

public class CategoryControl {

	public CategoryControl() {
	}

	public static boolean categoryExistInTheAdminSystem(String name, String ID) {
		Vector<Category> categories = AdminDB.Virtual_DB.getCategory();
		for (int i = 0; i < (int) categories.size(); i++) {
			if (categories.get(i).getName().equals(name) && categories.get(i).getID().equals(ID)) {
				return true;
			}
		}
		return false;
	}

	public void addCategory(Category category) {
		// TODO implement here
	}

	public void removeCategory(Category category) {
		// TODO implement here
	}

	public void searchByCategory(String categoryName) {
		// TODO implement here
	}

}