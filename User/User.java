package User;
import java.util.*;

public class User {
    private static final int FRIENDS_QTY = 3;
    private Long id;
    private String name;
    private String surname;
    private LinkedList<User> friends;

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;

        this.friends = UserUtil.generateFriendsList(FRIENDS_QTY);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<User> getFriends() {
        return friends;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getName(), user.getName()) && Objects.equals(getSurname(), user.getSurname()) && Objects.equals(getFriends(), user.getFriends());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname());
    }

    @Override
    public String toString() {
        return name;
    }
}
