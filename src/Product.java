
public class Product {

	private String name, ID;
	private Category category;
	private Brand brand;
	private int quantity;
	private double price;
	private long numberOfviews;
	private Advertisment advertisment;
	private StoreOwner storeOwner;

	public Product() {
	}

	public Product(String name, String ID, Category category, Brand brand, double price, int quantity) {
		this.name = name;
		this.ID = ID;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setAdvertisment(Advertisment ad) {
		this.advertisment = ad;
	}

	public Advertisment getAdvertisment() {
		return advertisment;
	}

	public long getNumberOfviews() {
		return numberOfviews;
	}

	public void setNumberOfviews(long numberOfviews) {
		this.numberOfviews = numberOfviews;
	}

	public StoreOwner getStoreOwner() {
		return storeOwner;
	}

	public void setStoreOwner(StoreOwner storeOwner) {
		this.storeOwner = storeOwner;
	}

}