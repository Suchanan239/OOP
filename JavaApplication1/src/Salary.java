import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sn.nextLine();
        System.out.print("Please insert your age : ");
        int age = nm.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = nm.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = nm.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = nm.nextInt();
        int salary = 0;
        System.out.println("Hi, "+name);
        if (age >= 21 & age <= 30) {
            salary = (numDay1*300) - (numDay2*50);
        }
        if (age >= 31 & age <= 40) {
            salary = (numDay1*500) - (numDay2*50);
        }
        if (age >= 41 & age <= 50) {
            salary = (numDay1*1000) - (numDay2*25);
        }
        if (age >= 51 & age <= 60) {
            salary = numDay1*3000;
        }
        System.out.println("Your salary is " + salary + " Baht");
        if (weight >= 10 & weight <= 60){
            salary = salary + 5000;
        }
        if (weight >= 61 & weight <= 90){
            salary = salary+(5000-((weight-60)*10));
        }
        System.out.println("Your salary and Bonus is " + salary + " Baht");
    }
}
