import java.util.Arrays;
public class UserDao {
    private String[] users;

    public UserDao(String[] users) {
        this.users = Arrays.copyOf(users, users.length);
    }

    public String getUser(int id) throws ArrayIndexOutOfBoundsException, NoSuchUserException {
        if (id >= users.length) {
            throw ArrayIndexOutOfBoundsException;
        } else if (users[id] == null) {
            throw NoSuchUserException;
        }
        // Catch the ArrayIndexOutOfBoundsException
        // Re-throw a NoSuchUserException
        return users[id];
    }
}
