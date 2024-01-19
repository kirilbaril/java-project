import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<String> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Song added: " + song);
    }

    public void removeSong(String song) {
        if (songs.contains(song)) {
            songs.remove(song);
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void playRandomSong() {
        if (!songs.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(songs.size());
            String randomSong = songs.get(randomIndex);
            System.out.println("Now playing: " + randomSong);
        } else {
            System.out.println("No songs in the library. Add songs first.");
        }
    }

    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        musicLibrary.addSong("Song1");
        musicLibrary.addSong("Song2");
        musicLibrary.addSong("Song3");

        musicLibrary.playRandomSong();

        musicLibrary.removeSong("Song2");

        musicLibrary.playRandomSong();
    }
}