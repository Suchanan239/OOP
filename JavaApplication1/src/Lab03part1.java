import java.util.Scanner;
public class Lab03part1 {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        int Odd_count = 0;
        int Even_count = 0;
        while (true){
            int i = nm.nextInt();
            if (i == -1){
                break;
            }
            if (i%2 == 0){
                Even_count += 1;
            }
            if (i%2 != 0){
                Odd_count += 1;
            }
        }
        System.out.println("Odd number = " + Odd_count +" and Even number = "+ Even_count);
    }
    
}
