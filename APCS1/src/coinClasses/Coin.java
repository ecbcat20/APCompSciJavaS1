package coinClasses;

public class Coin {
	private Boolean face;
	private int flips = 0;

	static int heads = 0;
	static int tails = 0;

	public Coin(Boolean face, int flips) {
		this.face = face;
		this.flips = flips;
	}

	Boolean getFace() {
		return face;
	}

	int getFlips() {
		return flips;
	}

	void flip() {
		flips++;
		face = !face;
	}
}
