import java.util.ArrayList;

public class User {
    private int id;
    public String username;
    private ArrayList<Playlist> likedPlaylist;

    public User(int id, String username, ArrayList<Playlist> likedPlaylist) {
        this.id = id;
        this.username = username;
        this.likedPlaylist = likedPlaylist;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<Playlist> getLikedPlaylist() {
        return likedPlaylist;
    }
}
