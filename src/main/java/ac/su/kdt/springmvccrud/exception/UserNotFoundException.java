package ac.su.kdt.springmvccrud.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("No such user (id: " + id + ").");
    }
}
