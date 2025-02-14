package delivery.classes;

import java.util.Date;

public class Booking {
	private String regEmail;
	private String premiseID;
	private Date bookingDate;
	private Date checkInDate;
	private Date checkOutDate;
	private int noOfPerson;
	private double totalAmount;
	private Payment payment;
	private double serviceFee;
	
	public Booking(String regEmail, String premiseID, 
		Date bookingDate, Date checkInDate, Date checkOutDate, 
		int noOfPerson, double totalAmount, Payment payment, 
		double serviceFee) {

		this.regEmail = regEmail;
		this.premiseID = premiseID;
		this.bookingDate = bookingDate;
		this.setCheckInDate(checkInDate);
		this.setCheckOutDate(checkOutDate);
		this.setNoOfPerson(noOfPerson);
		this.setTotalAmount(totalAmount);
		this.payment = payment;
		this.setServiceFee(serviceFee);
	}

	public String getRegEmail() {
		return regEmail;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getNoOfPerson() {
		return noOfPerson;
	}

	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Payment getPayment() {
		return payment;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	
	@Override
	public String toString() {
		return this.getRegEmail() + ";" + this.premiseID + ";" + this.getBookingDate() + ";" + this.getCheckInDate() + ";" + this.getCheckOutDate() + ";" + Integer.toString(this.getNoOfPerson()) + ";" + Double.toString(getTotalAmount()) + ";" + this.getPayment().getPaymentMethod() + ";" + this.getPayment().getPaymentID() + ";" + Double.toString(getServiceFee());
	}
}
