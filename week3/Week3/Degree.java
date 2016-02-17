package Week3;

public class Degree extends Qualification {

	private String subject;
	private int level;

	public String getSubject() {
		return this.subject;
	}

	/**
	 * 
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getLevel() {
		return this.level;
	}

	/**
	 * 
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

}