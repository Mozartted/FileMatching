/**
 * Created by Moz on 5/19/2015.
 */

public class TransactionRecord {
    //Objects from this class have an account and amount for the transaction.
    //variables
    int AccountNo;
    String name;
    double TransactionAmount;

    //constructor
    public void SetAccountNo(int Account){
        AccountNo=Account;
    }

    public void SetName(String NameFor){
        name=NameFor;
    }

    public void SetTransactionAmount(double TransAmount){
        TransactionAmount=TransAmount;
    }

    public int getAccountNo(){
        return AccountNo;
    }

    public String getName(){
        return name;
    }

    public double getTransactionAmount(){
        return TransactionAmount;
    }

}
