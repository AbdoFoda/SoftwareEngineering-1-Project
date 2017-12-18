public class AdminControl {

	public static boolean addProduct(Product product) {
		// return true if the product added successfully and false if it already exists
		// in the system
		return AdminDB.Virtual_DB.addProduct(product);
	}

	public static boolean addBrand(Brand brand) {
		return AdminDB.Virtual_DB.addBrand(brand);
	}

	public static boolean addCategory(Category category) {
		return AdminDB.Virtual_DB.addCategory(category);
	}

	public static void provideVoucherCard() {
		char alpha[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int step = 1, sz = 100;
		while (sz > 0) {
			String srial = "";

			int j = 4;
			while (j > 0) {
				for (int i = 0, k = step * j; i < 4; i++, k += sz - 11)
					srial += alpha[k % 26];
				j--;
				if (j > 0)
					srial += '-';
			}
			VoucherCard tmp = new VoucherCard(step * 10, srial + String.valueOf(step));

			AdminDB.Virtual_DB.addVoucherCard(tmp);
			sz--;
			step++;
		}

	}

}
