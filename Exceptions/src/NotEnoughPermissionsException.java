public class NotEnoughPermissionsException extends FileException{
    @Override
    public String getMessage() {
        return "YOU ARE NOT LOGGED IN";
    }
}
