package delivery.classes;

public class Premises {
	private int premiseID;
	private String name;
	private String address;
	private String type;
	private int capacity;
	private int numRoom;
	private String regEmail;
	private boolean active;
	
	public Premises(int premiseID, String name, String address, String type, int capacity, int numRoom, String regEmail) {
		this.premiseID = premiseID;
		this.name = name;
		this.address = address;
		this.type = type;
		this.capacity = capacity;
		this.numRoom = numRoom;
		this.regEmail = regEmail;
		this.setActive(true);
	}
	
	public Premises(int premiseID, String name, String address, String type, int capacity, int numRoom, String regEmail, boolean active) {
		this.premiseID = premiseID;
		this.name = name;
		this.address = address;
		this.type = type;
		this.capacity = capacity;
		this.numRoom = numRoom;
		this.regEmail = regEmail;
		this.active = active;
	}

	public int getPremiseID() {
		return premiseID;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getType() {
		return type;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getNumRoom() {
		return numRoom;
	}

	public String getRegEmail() {
		return regEmail;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean equals(int premiseID) {
		boolean isEqual = false;
		
		if(this.premiseID == premiseID) {
			isEqual = true;
		}
		return isEqual;
	}
	@Override
	public String toString() {
		return this.premiseID + ";" + this.getName() + ";" + this.getAddress() + ";" + this.getType() + ";" + this.getCapacity() + ";" + this.getNumRoom() + ";" + this.getRegEmail() + ";" + this.isActive();
	}
}
