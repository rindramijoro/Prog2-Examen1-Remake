public class Artist {
    private int id;
    public String artistName;
    public String nationality;
    public int debutYear;

    public Artist(int id, String artistName, String nationality, int debutYear) {
        this.id = id;
        this.artistName = artistName;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    public int getId() {
        return id;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getNationality() {
        return nationality;
    }

    public int getDebutYear() {
        return debutYear;
    }
}
