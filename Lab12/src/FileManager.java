
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
    String textOfFile = "";
            
    public String readFile(String fileName){
        try(FileInputStream fin = new FileInputStream(fileName);){
            int i = fin.read();
            while(i != -1){
                textOfFile += (char)i;
                i = fin.read();
                }
            }catch(IOException e){
                    System.out.println(e);
            }
        return textOfFile;
    }
    public void writeFile(String fileName, String textOfChat){
        try(FileWriter fout = new FileWriter(fileName);){
            fout.write(textOfChat);
            }catch(IOException e) {
            System.out.println(e);
        }
    }    
}

