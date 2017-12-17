
public class ProductControl {

    public ProductControl() {
    }

    public void addProductToSystem(Product product) {
        // TODO implement here
    }

    public void removeProductFromSystem(Product product) {
        // TODO implement here
    }

    public void viewProduct(Product product) {
    	
        System.out.println("product name: " + product.getName());
        System.out.println("product price: " + product.getPrice());
        System.out.println("product category: " + product.getCategory().getName());
        System.out.println("product brand: " + product.getBrand().getName());
        
        // increase number of views of that product here 
    }
    
    public void exploreProductNumOfViews(Product product){
    	
    }
    
//    public void addProductToCart(Product product, Cart cart) {
//        cart.addProduct(product); 
//    }

    public void removeProductFromCart(Product product) {
        // TODO implement here
    }

    public void searchByProductName(String name) {
        // TODO implement here
    }

    public void addProductToStore(Product product) {
        // TODO implement here
    }

    public void removeProductFromStore(Product product, Store store) {
        // TODO implement here
    }

    public void marketProduct(Product product) {
        // TODO implement here
    }

    public void suggestProduct(Product product) {
        RequestsPage RP = new RequestsPage();
        RP.addProduct(product);
    }

}