
public class CartControl {

    public CartControl() {
    }

    public void buyProducts(Cart cart) {
        // TODO implement here
    }

    public void viewCart(Cart cart) {
    	System.out.println("products in the cart: ");
    	System.out.println("..........................");
    	
        for(int i = 0 ; i < cart.getProducts().size() ; i++){
        	System.out.println("- " + cart.getProducts().get(i));
        }
    }

}