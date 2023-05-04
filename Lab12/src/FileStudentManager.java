
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileStudentManager {

    private Student student = new Student();

    public Student readFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return student;
    }

    public void writeFile(String fileName, int ID, String name, int money) {
        student.setID(ID);
        student.setName(name);
        student.setMoney(money);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("StudentM.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
