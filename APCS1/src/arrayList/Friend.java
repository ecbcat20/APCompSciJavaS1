package arrayList;

public class Friend {

	String firstName;
	String lastName;
	int level;
	final int MAX_LEVEL;

	public Friend(String firstName, String lastName, int level) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.level = level;
		MAX_LEVEL = 2;
	}

	public String toString() {
		String s = firstName + " " + lastName + " LEVEL: " + level;
		return s;
	}

	public void improveFS() {
		level++;
	}

}
