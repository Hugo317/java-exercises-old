public class NotEnoughSpaceException extends FileException{
    @Override
    public String getMessage() {
        return "Don't have enough space";
    }
}
