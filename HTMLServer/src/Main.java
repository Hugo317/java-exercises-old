import java.io.File;

public class Main {
    public static void main(String[] args) {
String test = "/test";
test = test.substring(1);
        System.out.println(test);
        File file = new File("resources/image.png");
        String name = file.getName();
        System.out.println(name);
        String extension = name.substring(name.indexOf("."));
        System.out.println(extension);
    }
}
