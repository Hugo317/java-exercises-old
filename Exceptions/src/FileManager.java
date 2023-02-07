public class FileManager {

    private boolean isLoggedIn = false;
    private File file;
    File[] allFiles;
    private int filesPulled = 0;
    FileManager (String[] array){
        allFiles = new File[array.length];
        sortFiles(allFiles, array);
    }

    private void sortFiles (File[] array,String[] files ){
        for (int i = 0; i < files.length; i++) {
            createFile(files[i]);
            array[i] = file;
        }
    }


    public void logIn() {
        if (!isLoggedIn){
            isLoggedIn = true;
            System.out.println("You are now logged in");
        }
        else System.out.println("Don't need, you are already logged in");
    }

    public void logOut(){
        if (isLoggedIn){
            System.out.println("You successfully logged out, see you later");
            isLoggedIn = false;
        }
        else {
            System.out.println("You need to log in first");
        }
    }

    public void createFile(String name){
        file = new File(name);

    }

    public File getFile(String name) throws FileException {
        // CHECK LOGIN
        // CHECK NAME
        // CHECK ONE PULLED AT A TIME
        File holder = new File("change me");
        boolean fileFound = false;
        if (!isLoggedIn) {
            throw new NotEnoughPermissionsException();
        }
        if(filesPulled!=0){
            throw new NotEnoughSpaceException();
        }

        for (File file : allFiles){
            if(file.getName().equals(name)){
                fileFound = true;
                holder = file;
                filesPulled ++;
            }
        }
        if (!fileFound){
            throw new FileNotFoundException();
        }
        return holder;
    }
}
