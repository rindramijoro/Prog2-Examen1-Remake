import java.util.Date;

public class Solo extends Artist{
    public String firstName;
    public String lastName;
    public Date birthday;

    public Solo(int id, String artistName, String nationality, int debutYear, String firstName, String lastName, Date birthday) {
        super(id, artistName, nationality, debutYear);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }
}
