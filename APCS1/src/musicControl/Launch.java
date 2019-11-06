package musicControl;

public class Launch {
    public static void main(String[] args) {

        MP3 songList1 = new MP3(); // create new song list
        songList1.addSong("Beautiful People"); // add song
        songList1.addSong("Eastside");
        songList1.addSong("Parachute");

        System.out.println(songList1.returnList()); // return contents of list

        songList1.removeSong("Beautiful People"); // remove song

        System.out.println(songList1.returnList( )); // return contents of list

    }
}