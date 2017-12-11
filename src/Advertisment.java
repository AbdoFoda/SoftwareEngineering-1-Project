
public class Advertisment {

    private String location;
    private float price;
    private int duration;


    public Advertisment() {
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setPrice(float price) {
    	this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

}