import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class CategoryDB {

	private List<Category> categories = new ArrayList<Category>();

	public CategoryDB() {
	}

	public void addCategory(Category category) {
		categories.add(category);
	}

	public void removeCategory(String ID) {
		// TODO implement here
	}

	public void updateCategory(String ID) {
		// TODO implement here
	}

	public Category getCategory(String Name) {
		for (int i = 0; i < categories.size(); i++) {
			if (categories.get(i).getName().equals(Name)) {
				return categories.get(i);
			}
		}
		return null;
	}

	public List<Category> getAllCategories() {
		return categories;
	}

}