import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        s.mScore = sc.nextInt();
        s.fScore = sc.nextInt();
        s.showGrade();
    }
}
