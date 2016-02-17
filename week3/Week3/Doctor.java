package Week3;

public class Doctor extends Professional {

	private String hospital;
	private String department;

	public String getHospital() {
		return this.hospital;
	}

	/**
	 * 
	 * @param hospital
	 */
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getDepartment() {
		return this.department;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

}