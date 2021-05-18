package gameDemo.Entities;

public class Campaing {
	
	private String campainNameString;
	private double discount;
	
	public Campaing() {
		
	}

	public Campaing(String campainNameString, double discount) {
		super();
		this.campainNameString = campainNameString;
		this.discount = discount;
	}

	public String getCampainNameString() {
		return campainNameString;
	}

	public void setCampainNameString(String campainNameString) {
		this.campainNameString = campainNameString;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
