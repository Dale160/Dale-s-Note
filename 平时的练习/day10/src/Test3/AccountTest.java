package Test3;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setId(12345);
        a1.setBalance(666666);
        a1.setAnnualInterestRate(3.75);

        a1.show();

        //存钱
        a1.deposit(2000);
        a1.show();

        a1.withdraw(10000);
        a1.show();

        a1.withdraw(88888888);
        a1.show();
    }
}
