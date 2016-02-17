package Week3;

public class Teacher extends Professional {

	private int classYear;
	private int numOfStud;
	private String school;

	public int getClassYear() {
		return this.classYear;
	}

	/**
	 * 
	 * @param classYear
	 */
	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

	public int getNumOfStud() {
		return this.numOfStud;
	}

	/**
	 * 
	 * @param numOfStud
	 */
	public void setNumOfStud(int numOfStud) {
		this.numOfStud = numOfStud;
	}

	public String getSchool() {
		return this.school;
	}

	/**
	 * 
	 * @param school
	 */
	public void setSchool(String school) {
		this.school = school;
	}

}