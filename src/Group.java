import java.util.ArrayList;

public class Group extends Artist{
    public ArrayList<Solo> members;

    public Group(int id, String artistName, String nationality, int debutYear, ArrayList<Solo> members) {
        super(id, artistName, nationality, debutYear);
        this.members = members;
    }

    public ArrayList<Solo> getMembers() {
        return members;
    }
}
