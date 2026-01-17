/*
🔹 Question 7: Getter–Setter with Validation
Create a class Account with private variables:accountNo,balance
Requirements:
Use setter methods to set values
Do not allow balance to be negative
Use getter methods to display values
 */
package jan12;

/**
 *
 * @author TASRIF ZAMAN
 */
class Account{
    private int accountNo;
    private double balance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
         if (balance >= 0) {
            this.balance = balance;
        } else {
           System.out.println("Do not allow balance to be negative");
        }
    }

    @Override
    public String toString() {
        return "Account{ " + " AccountNo = " + accountNo + ", Balance = " + balance + '}';
    }
    
}
public class Q7 {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccountNo(10226161);
        ac.setBalance(-234566.98);
        System.out.println(ac);
    }
}
