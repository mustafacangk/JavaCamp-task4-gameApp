package gameApp;

public class Campaign {
	private String campaignName;
	private double discountRate;
	private int limitedPerson;
	
	public Campaign() {
		
	}
	public Campaign(String campaignName, double discountRate, int limitedPerson) {
		super();
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.limitedPerson = limitedPerson;
	}
	
	public String getCampainName() {
		return campaignName;
	}
	public void setCampainName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public int getLimitedPerson() {
		return limitedPerson;
	}
	public void setLimitedPerson(int limitedPerson) {
		this.limitedPerson = limitedPerson;
	}
	
	

}
 
 