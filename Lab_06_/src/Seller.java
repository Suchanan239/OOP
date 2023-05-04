
public class Seller extends Employee {
    public Food sell(Employee e) {
        Food f1 = new Food();
        if (f1.getPrice() > e.getWallet().getBalance()){
            System.out.println("Your money is not enough.");
            return null;
        }
        else{
            getWallet().setBalance(getWallet().getBalance()+f1.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance()-f1.getPrice());
            return f1;
        }
    }
}
