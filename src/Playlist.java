import java.util.ArrayList;

public class Playlist {
    public String name;
    public ArrayList<Song> songs;
    public ArrayList<Album> albums;
    public ArrayList<User> likes;

    public Playlist(String name, ArrayList<Song> songs,ArrayList<Album> albums, ArrayList<User> likes) {
        this.name = name;
        this.songs = songs;
        this.likes = likes;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public ArrayList<User> whoLikedIt() {
        return likes;
    }

    public int getTotalLikes(){
        return  likes.size();
    }

    public void addToPlaylist(Song song){
        songs.add(song);
    }

    public void addToPlaylist(Album album){
        albums.add(album);
    }

    public void exclude(Genre genre){
        for(int i = 0; i < songs.size(); i++){
            if(songs.get(i).getGenre().equals(genre)){
                songs.remove(i);
            }
        }
    }

    public void like(User user){
        if(likes.contains(user)){
            likes.remove(user);
            user.getLikedPlaylist().remove(this);
        }
        else{
            likes.add(user);
            user.getLikedPlaylist().add(this);
        }
    }
}
