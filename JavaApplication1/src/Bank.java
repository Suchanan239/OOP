import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        System.out.print("Input your money : ");
        double your_money = sc.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        String account_type = st.nextLine();
        switch (account_type) {
            case "A", "C":
                System.out.println("Your total money in one year = "+((your_money*0.015)+your_money));
                break;
            case "B":
                System.out.println("Your total money in one year = "+((your_money*0.020)+your_money));
                break;
            case "X":
                System.out.println("Your total money in one year = "+((your_money*0.050)+your_money));
}
        
    }
}
