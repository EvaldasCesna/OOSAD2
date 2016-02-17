package Week3;

public class Pilot extends Professional {

	private String licence;
	private String airline;
	private int fHours;
	private int attribute;

	public String getLicence() {
		return this.licence;
	}

	/**
	 * 
	 * @param licence
	 */
	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getAirline() {
		return this.airline;
	}

	/**
	 * 
	 * @param airline
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getFHours() {
		return this.fHours;
	}

	/**
	 * 
	 * @param fHours
	 */
	public void setFHours(int fHours) {
		this.fHours = fHours;
	}

	public void getAttribute() {
		// TODO - implement Pilot.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

}