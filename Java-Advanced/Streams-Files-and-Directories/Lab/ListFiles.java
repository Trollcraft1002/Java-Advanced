import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class ListFiles {
    public static void main(String[] args) {

       File[] test =   File.listRoots();
        for (File fileName : test){
            System.out.print(fileName.getPath() + " ");
            System.out.print(fileName.getFreeSpace()/1024/1024/1024 + " GB ");
            System.out.print("| Of: " + fileName.getTotalSpace()/1024/1024/1024 + " GB");
            System.out.println();

        }
    }
}
