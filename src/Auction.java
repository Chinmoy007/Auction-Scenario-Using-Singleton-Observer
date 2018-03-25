
public class Auction {
	private Product product;

	public Auction() {
		product = Product.getIntance();
		
		bid();

	}

	private void bid() {
		

		IBidders bidder1 = new Bidder("Stephen Hawking");
		IBidders bidder2 = new Bidder("NewTone");
		IBidders bidder3 = new Bidder("Einstein");

		product.register(bidder1);
		product.register(bidder2);
		product.register(bidder3);
	
		product.sellPriceIncrease(4000, bidder1);
		product.sellPriceIncrease(6000, bidder3);
		product.sellPriceIncrease(7000, bidder2);
	}

	
}
