
public class Product {

    private String name, ID;
    private Category category;
    private Brand brand;
    private int quantity;
    private float price;
    private Advertisment advertisment;
	
	public Product() {
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

    public void setPrice(float price) {
    	this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setAdvertisment(Advertisment ad) {
        this.advertisment = ad;
    }

    public Advertisment getAdvertisment() {
        return advertisment;
    }

}