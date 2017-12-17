public class AdminControl {

	public static boolean addProduct(Product product) {
		// return true if the product added successfully and false if it already exists
		// in the system
		return AdminDB.addProduct(product);
	}

	public static boolean addBrand(Brand brand) {
		return AdminDB.addBrand(brand);
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
			VoucherCard tmp = new VoucherCard((float) step * 10, srial + String.valueOf(step), step * 10 + step);

			DataBase.addVoucherCard(tmp);
			sz--;
			step++;
		}

	}

}
