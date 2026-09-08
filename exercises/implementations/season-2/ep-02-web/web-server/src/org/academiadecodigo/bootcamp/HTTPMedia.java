package org.academiadecodigo.bootcamp;

public class HTTPMedia {


    public static boolean isHTML(String file){
        return getExtension(file).equals("html");
    }

    public static String getExtension(String resource){
        return resource.substring(resource.lastIndexOf(".") + 1);
    }

    public static boolean isImage(String file) {

        switch(getExtension(file)){
            case "jpg":
            case "jpeg":
            case "png":
                return true;
            default:
                return false;
        }
    }
}
