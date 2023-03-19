import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
This class simplifies reading and display of textfile
- this class is a kind of facade
 */
public class FileLoader {
    private String filename;

    public FileLoader(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void readAnddisplay() {
        try {
            File myObj = new File(this.filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        public static void main (String args[]){
           // FileLoader fl = new FileLoader("filename.txt");
            System.out.println(fl.getFilename);
            //fl.readAnddisplay();

        }
    }
}
