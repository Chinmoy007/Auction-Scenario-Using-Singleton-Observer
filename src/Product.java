import java.util.ArrayList;
import java.util.List;

public class Product {
	public double price;
	private static Product instance = null;
	private List<IBidders> bidders = new ArrayList();
	
	private Product(double price) {
		this.price = price;
	}

	public static Product getIntance() {
		if (instance == null) {
			instance = new Product(5000.00);
		}
		return instance;
	}
	
	public void register(IBidders bidder) {
		bidders.add(bidder);
		System.out.println(bidder + "has been added");
	}

	public void unregister(IBidders delBidder) {
		bidders.remove(delBidder);
		System.out.println(delBidder + "has been removed");
	}

	public void sellPriceIncrease(double price, IBidders bidder){
		if(this.price<price){
			this.price = price;
			
			System.out.println("New Price: "+ price);
			bidder.setBidValue(price);
			notifyAllBidders(bidder);
			
		}
	}
	
	public void notifyAllBidders(IBidders topBidder) {
		for (IBidders bidder : bidders) {
			if(bidder!=topBidder){
				bidder.getNotified(price, bidder);
			}
		}
	}
}
