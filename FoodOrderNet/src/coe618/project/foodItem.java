package coe618.project;



import java.util.ArrayList;

/**
 *
 * @author alisharif
 */
public class foodItem extends Menu{
    private String food;
    private int price;
    private int total = 0;
    
    /**
     *
     * @param food
     * @param price
     */
    public foodItem (String food, int price){
        this.price = price;
        this.food = food;
    }
    @Override
    public String toString(){
        String result = (getFood() + " : " + getPrice());
        return result;
    }

    /**
     *
     * @return
     */
    public int getPrice() {
	return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(int price) {
	this.price = price;
    }

    /**
     *
     * @return
     */
    public String getFood() {
	return food;
    }

    /**
     *
     * @param food
     */
    public void setFood(String food) {
	this.food = food;
    }
}
