package AccountExer;

public class Account {

    private int id;
    private String password = "000000";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;

    private static int init = 1001;//用于自动生成id

    public Account(){
        id = init++;

    }

    public Account(String password, double balance){
        id = init++;
        this.password = password;
        this. balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getInit() {
        return init;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
