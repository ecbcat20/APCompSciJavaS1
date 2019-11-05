package musicControl;

import java.util.ArrayList;

public class MP3 {

    @SuppressWarnings("unused")
    private MP3 name;

    @SuppressWarnings("unused")
    private String alias;

    public MP3() {

    }

    ArrayList<String> music = new ArrayList<String>(); // create list

    public void addSong(String name) {
        music.add(name); // add to arraylist
    }

    public void removeSong(String name) {
        music.remove(name); // remove from arraylist
    }

    ArrayList<String> returnList() {
        return music; // return music in arraylist
    }

}