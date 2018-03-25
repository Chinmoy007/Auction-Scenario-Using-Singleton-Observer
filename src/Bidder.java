
public class Bidder implements IBidders {

	public String bidderName;
	public double bidValue;

	public Bidder(String bidderName) {
		this.bidderName = bidderName;
	}

	@Override
	public void getNotified(Double newPrice, IBidders bider) {
		System.out.println("Dear " + bidderName + ", new price = " + newPrice + " by " + bider.getBidderName()
				+ " -  Paddle Number: " + bider);
	}

	@Override
	public String getBidderName() {

		return this.bidderName;
	}

	@Override
	public void setBidValue(double newValue) {
		bidValue = newValue;

	}

}
