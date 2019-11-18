package coinClasses;

import java.util.ArrayList;

public class Coin {
	private boolean face;
	private int flips = 0;
	int heads, tails = 0;

	public static ArrayList<Coin> coins = new ArrayList<>();

	public static ArrayList<Boolean> coinFaces = new ArrayList<>();

	public Coin(boolean face, int flips) {
		this.face = face;
		face = false;
		this.flips = flips;
		flips = 0;
	}

	boolean getFace() {
		return face;
	}

	int getFlips() {
		return flips;
	}

	void flip() {

		face = !face;
		if (face) {
			heads++;
		} else {
			tails++;
		}

		flips++;
	}

}
