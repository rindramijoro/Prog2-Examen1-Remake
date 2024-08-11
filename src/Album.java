import java.util.ArrayList;
import java.util.Date;

public class Album {
    private int id;
    public Date publishDate;
    public String title;
    public ArrayList<Song> songs;

    public Album(int id, Date publishDate, String title, ArrayList<Song> songs) {
        this.id = id;
        this.publishDate = publishDate;
        this.title = title;
        this.songs = songs;
    }

    public int getId() {
        return id;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
