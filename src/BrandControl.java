import java.util.Vector;

public class BrandControl {

	public BrandControl() {
	}

	public static boolean brandExistInTheAdminSystem(String name, String ID) {
		Vector<Brand> brands = AdminDB.Virtual_DB.getBrand();
		for (int i = 0; i < (int) brands.size(); i++) {
			if (brands.get(i).getName().equals(name) && brands.get(i).getID().equals(ID)) {
				return true;
			}
		}
		return false;
	}

	public void addBrand(Brand brand) {
		// TODO implement here
	}

	public void removeBrand(Brand brand) {
		// TODO implement here
	}

	public void searchByBrand(String brandName) {
		// TODO implement here
	}

}