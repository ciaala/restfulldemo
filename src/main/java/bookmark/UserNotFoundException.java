package bookmark;

/**
 * Created by crypt on 03/05/17.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userId) {
        super("Unable to find the user " + userId);
    }
}
