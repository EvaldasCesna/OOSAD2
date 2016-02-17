public class CartItem {
	
	private int ID;
	private double price;
	
	public int getID(){
		return this.ID;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}

	public CartItem() {
		// TODO - implement CartItem.CartItem
		throw new UnsupportedOperationException();
	}
	public CartItem(int ID, double price){
		this.ID = ID;
		this.price = price;
	}

}