public class Main {
    public static void main(String[] args) {
        String[] allFiles = {"File1", "File2", "File3"};
        FileManager fileManager = new FileManager(allFiles);

        //fileManager.logIn();

        try {
            int failCode = 2;
            switch (failCode){
                case (1):
                    fileManager.getFile("File1");
                    break;
                case (2):
                    fileManager.logIn();
                    System.out.println(("DOWNLOADED: " + fileManager.getFile("File1").getName()));
                    break;
                case (3):
                    fileManager.logIn();
                    fileManager.getFile("Biblia");
                    break;
                case (4):
                    fileManager.logIn();
                    System.out.println("DOWNLOADED: " + (fileManager.getFile("File1").getName()));
                    fileManager.getFile("File2");
                    break;
            }


        }

        catch (NotEnoughPermissionsException a){
            System.out.println(a.getMessage());
        }
        catch (NotEnoughSpaceException a){
            System.out.println(a.getMessage());
        }
        catch (FileNotFoundException a){
            System.out.println(a.getMessage());
        }
        catch (FileException a){
            System.out.println("I'm here");
        }

















    }
}