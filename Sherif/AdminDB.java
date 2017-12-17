import java.util.Vector;

public class DataBase {

    public static class Virtual_DB
    {
    	static  Vector<Product> products=new Vector<Product> ();
    	static  Vector<Brand> brands=new Vector<Brand> ();
    	static  Vector<VoucherCard> voucherCards=new Vector<VoucherCard> ();
    }
    
    public static boolean addProduct(Product product) {
    	boolean exist=checkExistance(product);
    	if(!exist)
    	    Virtual_DB.products.addElement(product);
    	return !exist;
    }
    
    public static boolean addBrand(Brand brand) {
    	boolean exist=checkExistance(brand);
    	if(!exist)
        	Virtual_DB.brands.addElement(brand);
		return !exist;
    }
    
    public static boolean addVoucherCard(VoucherCard voucherCard) {
    	boolean exist=checkExistance(voucherCard);
    	if(!exist)
    	    Virtual_DB.voucherCards.addElement(voucherCard);
		return !exist;
    }
    
    public static boolean checkExistance(Product product)
    {
    	for(int i=0;i<Virtual_DB.products.size();i++)
    	{
    		if(product.equals(Virtual_DB.products.get(i)))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean checkExistance(Brand brand )
    {
    	for(int i=0;i<Virtual_DB.brands.size();i++)
    	{
    		if(brand.equals(Virtual_DB.brands.get(i)))
    		{
    			return true;
    		}
    	}

    	return false;
    }

    public static boolean checkExistance(VoucherCard voucherCard)
    {
    	for(int i=0;i<Virtual_DB.voucherCards.size();i++)
    	{
    		if(voucherCard.equals(Virtual_DB.voucherCards.get(i)))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
}
