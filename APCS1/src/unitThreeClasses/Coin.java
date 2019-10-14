package unitThreeClasses;

public class Coin {

	private boolean face; // true as heads

	// default constructor
	public Coin(boolean f) {
		face = f;
	}

	public void flip() {

		if (face == true) {
			face = false;

		} else {
			face = true;

		}

		// face =! face (other way to write)
	}

	public boolean isHead() {
		if (face = true) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		if (face == true) {
			return "heads";
		} else {
			return "tails";
		}
	}

}
