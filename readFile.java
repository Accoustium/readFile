import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class readFile {
    public static void main(String[] args) throws IOException {
        readFile rf = new readFile();
        String contents = rf.readString("test_data/lorem.txt");
        System.out.println(contents);
    }

    public boolean validateFile(String file) {
        File f = new File(file);
        return f.exists();
    }

    public String readString(String file) throws IOException {
        if (!this.validateFile(file)) {
            return "";
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String readLine = null;
        StringBuilder returnString = new StringBuilder();

        try {
            while ((readLine = reader.readLine()) != null) {
                returnString.append(readLine).append('\n');
            }
        } finally {
            reader.close();
        }

        return returnString.toString();
    }

//    public String readJson(String fileName) {
//
//    }
}
