public class Brand {
 
	private String name ;
	private String ID;
	Brand(String name,String id){
		this.name=name;
		ID=id;
	}
	void setName (String name){
		this.name=name;
	}
	void setID (String ID){
		this.ID=ID;
	}
	String getName(){
		return name;
	}
	String getID(){
		return ID;
	}
	
}
