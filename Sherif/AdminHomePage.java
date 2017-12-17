import java.util.Scanner;


public class AdminHomePage {
 
   static Scanner in=new Scanner(System.in);

	public static void entryPage() {
		 System.out.println("please choose a function : ");
		 System.out.println("1) add Product  ");
		 System.out.println("2) add Brand ");
		 System.out.println("3) provide Voucher Card ");
		 System.out.println("4) Exit  ");

         int choice=in.nextInt();
	        in.nextLine();


         switch (choice)
         {
         case 1:
        	 addProduct();
        	 break;
         case 2:
        	 addBrand();
        	 break;
         case 3:
        	 provideVoucherCard();
        	 break;
         case 4:
        	 System.exit(0);
        	 break;
         case 5:
        	 in.close();
        	 System.out.println("invalid input ");
        	 break;
         }
	    }
	 
	   
	 
	 public static void addProduct() {
		 	
	       
	        System.out.println("please enter product information");
	        System.out.println("product name :");
	       
	         String  name=in.nextLine();
	        System.out.println("product ID :");
	        String id=in.nextLine();
	        System.out.println("category name :");
	        String categoryName=in.nextLine();
	        System.out.println("category ID :");
	        String categoryId=in.nextLine();
	        System.out.println("brand name:");
	        String brandName=in.nextLine();
	        System.out.println("brand ID:");
	        String brandId=in.nextLine();
	        System.out.println("quantity :");
	        int quantity=in.nextInt();
	        System.out.println("price :");
	        float price=in.nextFloat();
	        Category category=new Category(categoryName,categoryId);
	        Brand brand=new Brand(brandName,brandId);
	        Product product=new Product(name,id,category,brand,price,quantity);
	       boolean check= AdminControl.addProduct(product);
	       if(check)
		        System.out.println("the product added successfully to the system");
	       else
	    	   System.out.println("the product already exists in the system");
	       
	    	  

	       
	    }
 
	  
	    public static void addBrand() {
	    	 System.out.println("brand name:");
		        String brandName=in.nextLine();
		        System.out.println("brand ID:");
		        String brandId=in.nextLine();
			Brand brand=new Brand(brandName,brandId);
	        
	        boolean check= AdminControl.addBrand(brand);
		       if(check)
			        System.out.println("the brand added successfully to the system ");
		       else
		    	   System.out.println("the brand already exists in the system");
		      
	    }


	    public static void provideVoucherCard() {
	    	
	    	AdminControl.provideVoucherCard();
	    	   System.out.println("VoucherCards generated successfully in the system");
	    	   		    	   

	    }
}
