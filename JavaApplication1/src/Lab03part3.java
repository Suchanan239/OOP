import java.util.Scanner;
public class Lab03part3 {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = nm.nextInt();
        for (int i = 1; i <= num; i++){
            if (i%5 == 0){
                System.out.println("|");
            }
            else {
                System.out.print("|");
            }
        }
    }
}
