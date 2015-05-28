/**
 * Created by Moz on 5/19/2015.
 */
public class AccountRecord {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public AccountRecord(){
        this(0,"","",0.0);
    }

    public AccountRecord(int acct,String first,String last,double bal){
        setAccount(acct);
        setFirstName(first);
        setLastName(last);
        setBalance(bal);

    }

    public void setAccount(int acct){
        account=acct;
    }

    public void setFirstName(String first){
        firstName=first;
    }

    public void setLastName(String last){
        lastName=last;

    }

    public void setBalance(double bal){
        balance=bal;

    }


    public double getBalance() {
        return balance;
    }

    public int getAccount() {
        return account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //the new method combine to increment balance on matching
    public void combine(AccountRecord Record){
        balance= (Record.balance) +balance;
    }



}
