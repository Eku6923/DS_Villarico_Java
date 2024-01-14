import java.util.LinkedList;

public class LinkedList_Villarico {
    private static LinkedList<String> songs = new LinkedList<>();
    private static LinkedList<String> artists = new LinkedList<>();
    private static LinkedList<String> album = new LinkedList<>();

    public static void main(String[] args) {
        songs.add("Fetty");
        songs.add("Finnese");
        songs.add("LUV DRUG");
        songs.add("TBH");
        songs.add("MERCEDES");

        artists.add("Realest Cram");
        artists.add("Drake");
        artists.add("Eros Tongco");
        artists.add("PARTYNEXTDOOR");
        artists.add("Brent Faiyaz");

        processNext();

        System.out.printf("%-25s %-15s %15s\n", "Songs: ", "Artist", "Album");
        System.out.printf("%-25s %-15s %15s\n", songs.get(0), artists.get(0), album.get(0));
        System.out.printf("%-25s %-15s %15s\n", songs.get(1), artists.get(1), album.get(1));
        System.out.printf("%-25s %-15s %15s\n", songs.get(2), artists.get(2), album.get(2));
        System.out.printf("%-25s %-15s %15s\n", songs.get(3), artists.get(3), album.get(3));
        System.out.printf("%-25s %-15s %15s\n", songs.get(4), artists.get(4), album.get(4));
    }

    private static int currentIndex = 0;

    private static void processNext() {
        if (currentIndex >= songs.size()) {
            return;
        }

        String combination = songs.get(currentIndex) + " - " + artists.get(currentIndex);
        album.add(combination);

        currentIndex++;
        processNext();
    }
}