
public interface IBidders {

	public String getBidderName();
	public void getNotified(Double newPrice, IBidders bider);
	public void setBidValue(double newValue);
}	
