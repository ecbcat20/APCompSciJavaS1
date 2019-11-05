package musicControl;

public class Launch {
	public static void main(String[] args) {

		MP3 songList1 = new MP3();
		songList1.addSong("Beautiful People");
		songList1.addSong("Eastside");
		songList1.addSong("Parachute");

		System.out.println(songList1.returnList());

		songList1.removeSong("Beautiful People");

		System.out.println(songList1.returnList());

	}
}