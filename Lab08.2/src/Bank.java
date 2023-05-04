public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){
        this.acct = new Account[10];
    }
    
    public void addAccount(Account ac){
        this.acct[numAcct] = ac;
        this.numAcct += 1;
    }
    
    public Account getAccount(int index){
        return this.acct[index];
    }
    
    public int getNumAccount(){
        return this.numAcct;
    }
}
