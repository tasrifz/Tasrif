package HomeJan06_01_2025;

import java.util.Scanner;
/*
Checked Exception : checked exception in compile-time.
recoverable problem, file not found, database issue.
eg : IOException, SQLException, ClassNotFoundException.
*/
public class TestCustomException {
    static class LowBalanceException extends Exception{

        public LowBalanceException(String message) {
            super(message);
        }
        
    }

    static void withdrow(int balance, int amount) throws LowBalanceException {
    
        if (amount > balance) {
            throw new LowBalanceException("Insufficient Balance : " + amount);   
        } else {
            System.out.println("Withdrwal Succesful. Remaing balance BDT." + +(balance-amount));
        }
}
    
    public static void main(String[] args) {
        //int currentBalance = 10000;
        //int withdrwalAmount = 6000;
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter CurrentBalance : ");
         int currentBalance = sc.nextInt();
        
        System.out.print("Enter withdrwalAmount : ");
        int withdrwalAmount = sc.nextInt();
        
        try {
            withdrow(currentBalance,withdrwalAmount);
        } catch (LowBalanceException e) {
            System.err.println("Transaction failed : " + e.getMessage());
        }
    }
}
