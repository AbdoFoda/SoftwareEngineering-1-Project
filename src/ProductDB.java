import java.util.ArrayList;
import java.util.List;

public class ProductDB {

	private List<Product> products = new ArrayList<Product>();
	
	public ProductDB() {
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String ID) {
    
    }

    public void updateProduct(String ID, Product updatedProduct) {
        // TODO implement here
    }

    public Product getProduct(String ID) {
        for(int i = 0 ; i < products.size() ; i++){
        	if(products.get(i).getID().equals(ID)){
        		return products.get(i);
        	}
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }

}