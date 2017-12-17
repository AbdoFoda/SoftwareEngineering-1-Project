
public class Category {

	private String name;
	private String ID;

	public Category() {

	}

	public Category(String name, String id) {
		this.name = name;
		ID = id;
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

}