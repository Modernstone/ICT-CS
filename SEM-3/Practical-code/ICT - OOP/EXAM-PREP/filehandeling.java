import java.io.File;
import java.io.exception;

public class filehandeling {
    public static void main(sys[] args) throws exception {
        file file= new file("d:\\testfile.txt")

        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}