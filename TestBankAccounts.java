public class TestBankAccounts {
    public static void main(String[] args) {
        BankAccount testerAccount = new BankAccount();
        testerAccount.deposit("savings", 500);
        testerAccount.deposit("checking", 200);
        testerAccount.withdraw("savings", 80);
        testerAccount.withdraw("checking", 131);
        System.out.println(testerAccount.getSavingsBalance());
        System.out.println(testerAccount.getCheckingBalance());
        System.out.println(testerAccount.getTotalBalance());
    }
}
