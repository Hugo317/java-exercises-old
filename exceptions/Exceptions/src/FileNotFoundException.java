public class FileNotFoundException extends FileException{
    @Override
    public String getMessage() {
        return "File is not here";
    }
}
