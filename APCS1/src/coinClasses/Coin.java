package coinClasses;

import java.util.ArrayList;

public class Coin {
	private Boolean face;
	public static int flips = 0;
	static int heads;
	static int tails = 0;

	public static ArrayList<Coin> coins = new ArrayList<>();

	public static ArrayList<Boolean> coinFaces = new ArrayList<>();

	public Coin(Boolean face, int flips) {
		this.face = face;
		face = false;
		this.flips = flips;
		flips = 0;
	}

	Boolean getFace() {
		return face;
	}

	int getFlips() {
		return flips;
	}

	void flip() {
		
		face = !face;

		if (face) {
			heads++;
		}
		if (!face) {
			tails++;
		}

		flips++;
	}

}
