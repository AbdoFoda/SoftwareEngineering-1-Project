import java.util.ArrayList;
import java.util.List;

public class BrandDB {

	private List<Brand> brands = new ArrayList<Brand>();

	public BrandDB() {
	}

	public void addBrand(Brand brand) {
		brands.add(brand);
	}

	public void removeBrand(String ID) {
		// TODO implement here
	}

	public void updateBrand(String ID) {
		// TODO implement here
	}

	public Brand getBrand(String ID) {
		for (int i = 0; i < brands.size(); i++) {
			if (brands.get(i).getID().equals(ID)) {
				return brands.get(i);
			}
		}
		return null;
	}

	public List<Brand> getAllBrands() {
		return brands;
	}
}