public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static double totalBalanceOfAllAccounts = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }
    public BankAccount(double checkingBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public double getTotalBalance(){
        return this.checkingBalance + this.savingsBalance;
    }

    public boolean deposit (String accountType, double amount){
        if (amount < 0){
            return false;
        }
        if (accountType == "savings" || accountType == "Savings"){
            this.savingsBalance += amount;
        } else{
            this.checkingBalance += amount;
        }
        return true;
    }

    public boolean withdraw (String accountType, double amount){
        if (amount < 0){
            return false;
        }
        if (accountType == "savings" || accountType == "Savings"){
            if (this.savingsBalance > amount){
                this.savingsBalance -= amount;
                return true;
            }
        } else {
            if (this.checkingBalance > amount){
                this.checkingBalance -= amount;
                return true;
            }
        }
        return false;
    }
}
