public class VoucherCard {

	private float value ;
	private String serialNum;
	private float  price;
	
	VoucherCard(float value,String serialNum,float  price){
		this.value=value;
		this.serialNum=serialNum;
		this.price=price;
	}
	
	void setValue(float value){
		this.value=value;
	}
	void setPrice(float price){
		this.price=price;
	}
	
	void setSerialNum (String serialNum){
		this.serialNum=serialNum;
	}
	
	float getValue(){
		return value;
	}
	float getPrice(){
		return price;
	}
	
	String getSerialNum(){
		return serialNum;
	}
}
