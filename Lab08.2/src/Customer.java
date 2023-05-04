import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
//    private Account acct[];
    private ArrayList<Account> acct;
    private int numOfAccount;
    public Customer(){
        this("", "");
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        this.acct = new Account[5];
        this.acct = new ArrayList();
    }
    
    public void addAccount(Account acct){
//        this.acct[numOfAccount] = acct;
        this.acct.add(acct);
        numOfAccount += 1;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return ("The "+firstName+lastName+" account has "+numOfAccount+" accounts.");
    }
    
//    public Account getAccount(int index){
//        return this.acct[index];
//    }
    
    public Account getAccount(int index){
        return acct.get(index);
    }
    
    public int getNumOfAccount(){
        return this.acct.size();
    }
    
    public boolean equals(Customer c){
        return ((this.firstName.equals(c.firstName)) & (this.lastName.equals(c.lastName)));

    }
}
