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

	public static void addProduct(Product product) {
		Product returnedProduct = productdExistInThesystem(product);
		if (returnedProduct == null) {
			addProduct(product);
		} else {
			returnedProduct.setQuantity(returnedProduct.getQuantity() + product.getQuantity());

		}
	}

	public static void addOnlineStore(Store store) {
		if (StoreControl.StoreExistInThesystem(store.getName()) == false) {
			StoreDB.addStore(store);
		}
	}

	public static void addOnsiteStore(Store store) {
		if (StoreControl.StoreExistInThesystem(store.getName()) == false) {
			StoreDB.addStore(store);
		}
	}
}