import java.util.ArrayList;
import java.util.Vector;

public class AdminDB {

	public static class Virtual_DB {
		static Admin admin1 = new Admin("1", "reem", "ali", "reem.ghnay", "1", "123");
		static Admin admin2 = new Admin("reemali", "reem", "ali", "reemt", "reem", "123");
		/// Admin admin3 = new Admin(userName, firstName, lastName, email, password,
		/// phoneNum)

		static Vector<Admin> admins = new Vector<>();
		static Vector<Product> products = new Vector<Product>();
		static Vector<Brand> brands = new Vector<Brand>();
		static Vector<Category> catgories = new Vector<Category>();
		static Vector<VoucherCard> voucherCards = new Vector<VoucherCard>();

		public static Vector<Product> getProducts() {
			return products;
		}

		public static Vector<Admin> getAdmins() {
			return admins;
		}

		public static Vector<Brand> getBrands() {
			return brands;
		}

		public static Vector<Category> getCategories() {
			return catgories;
		}

		public static Admin getAdmin(String Identifier) {
			admins.addElement(admin1);
			admins.addElement(admin2);
			for (int i = 0; i < admins.size(); i++) {
				if (admins.get(i).getEmail().equals(Identifier) || admins.get(i).getUserName().equals(Identifier))
					return admins.get(i);
			}
			return null;
		}

		public static boolean addAdmin(Admin admin) {
			boolean exist = checkExistance(admin);
			if (!exist)
				Virtual_DB.admins.addElement(admin);
			return !exist;
		}

		public static boolean addProduct(Product product) {
			boolean exist = checkExistance(product);
			if (!exist)
				Virtual_DB.products.addElement(product);
			return !exist;
		}

		public static boolean addBrand(Brand brand) {
			boolean exist = checkExistance(brand);
			if (!exist)
				Virtual_DB.brands.addElement(brand);
			return !exist;
		}

		public static boolean addVoucherCard(VoucherCard voucherCard) {
			boolean exist = checkExistance(voucherCard);
			if (!exist)
				Virtual_DB.voucherCards.addElement(voucherCard);
			return !exist;
		}

		public static boolean addCategory(Category category) {
			boolean exist = checkExistance(category);
			if (!exist)
				Virtual_DB.catgories.addElement(category);
			return !exist;
		}

		public static boolean checkExistance(Product product) {
			for (int i = 0; i < Virtual_DB.products.size(); i++) {
				if (product.equals(Virtual_DB.products.get(i))) {
					return true;
				}
			}
			return false;
		}

		public static boolean checkExistance(Brand brand) {
			for (int i = 0; i < Virtual_DB.brands.size(); i++) {
				if (brand.equals(Virtual_DB.brands.get(i))) {
					return true;
				}
			}

			return false;
		}

		public static boolean checkExistance(VoucherCard voucherCard) {
			for (int i = 0; i < Virtual_DB.voucherCards.size(); i++) {
				if (voucherCard.equals(Virtual_DB.voucherCards.get(i))) {
					return true;
				}
			}
			return false;
		}

		public static boolean checkExistance(Category category) {
			for (int i = 0; i < Virtual_DB.catgories.size(); i++) {
				if (category.equals(Virtual_DB.catgories.get(i))) {
					return true;
				}
			}
			return false;
		}

		public static boolean checkExistance(Admin admin) {
			for (int i = 0; i < Virtual_DB.admins.size(); i++) {
				System.out.println(admins.get(i).getPassword());
				if (admin.equals(Virtual_DB.admins.get(i))) {
					return true;
				}
			}
			return false;
		}

		public static ArrayList<User> convertAdminsToUsers() {
			ArrayList<User> users = new ArrayList<User>();
			for (int i = 0; i < admins.size(); i++) {
				User user = admins.get(i);
				users.add(user);
			}
			return users;
		}

	}
}
