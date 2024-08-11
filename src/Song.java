import java.util.ArrayList;

public class Song {
    private int id;
    public String title;
    public Artist singer;
    public Genre genre;

    public Song(int id, String title, Artist singer,Genre genre) {
        this.id = id;
        this.title = title;
        this.singer = singer;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Artist getSinger() {
        return singer;
    }

    public Genre getGenre() {
        return genre;
    }

}
