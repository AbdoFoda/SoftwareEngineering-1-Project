import java.util.ArrayList;
import java.util.List;

public class Store {

	protected String name;
	protected List<Product> products = new ArrayList<Product>();
	protected List<Category> categories = new ArrayList<Category>();
	protected List<Brand> brands = new ArrayList<Brand>();

	public Store() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean productExistInThesystem(Product requiredToAdd) {
		boolean check = false;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equals(requiredToAdd.getName()))
				check = true;
		}
		return check;
	}

	public void addStore(Product product) {
		if (productExistInThesystem(product) == false) {
			products.add(product);
		}
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		// TODO implement here
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addCategory(Category category) {
		categories.add(category);
	}

	public void removeCategory(Category category) {
		// TODO implement here
	}

	public List<Category> getCatogries() {
		return categories;
	}

	public void addBrand(Brand brand) {
		brands.add(brand);
	}

	public void removeBrand(Brand brand) {
		// TODO implement here
	}

	public List<Brand> getBrands() {
		return brands;
	}

}