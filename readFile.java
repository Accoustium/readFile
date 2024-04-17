import java.io.File;


public class readFile {
    public static void main(String[] args) {

    }

    public boolean validateFile(String fileName) {
        File f = new File(fileName);
        return f.exists();
    }
}
