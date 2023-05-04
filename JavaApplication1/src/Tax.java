import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        if (salary > 50000.00){
            System.out.print(salary*0.1);
        }
        else {
            System.out.print(salary*0.05);
        }
    }
    
}
