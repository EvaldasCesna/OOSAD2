import java.util.*;

public class Cart {

	private Collection<CartItem> cartItems;

	public Cart() {
		
		for(int i = 0; i<100; i++){
		
			cartItems.add(new CartItem(i,i));
		}
		// TODO - implement Cart.Cart
		throw new UnsupportedOperationException();
	}

}