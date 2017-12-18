public class OwnerControl {

	public OwnerControl() {
	}

	public void register(StoreOwner owner) {
		// TODO implement here
	}

	public void acceptOwner(StoreOwner owner) {
		// TODO implement here
	}

	public void rejectOwner(StoreOwner owner) {
		// TODO implement here
	}

	public static boolean productExistInTheAdminSystem(String name, String ID) {
		return ProductControl.productExistInTheAdminSystem(name, ID);
	}

	public static boolean categoryExistInTheAdminSystem(String name, String ID) {
		return CategoryControl.categoryExistInTheAdminSystem(name, ID);
	}

	public static boolean brandExistInTheAdminSystem(String name, String ID) {
		return BrandControl.brandExistInTheAdminSystem(name, ID);
	}

	public static Product productdExistInThesystem(Product product) {
		return ProductControl.productdExistInThesystem(product);
	}

	public static void addOnlineStore(Store store) {
		StoreControl.addOnlineStore(store);
	}

	public static void addOnsiteStore(OnsiteStore store) {
		StoreControl.addOnsiteStore(store);
	}
}