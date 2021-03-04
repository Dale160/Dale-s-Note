package Exer2;

public class Account {
    private int id;
    private double balance;//余额
    private double annualInterestRate;


    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    //取钱
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }

    //存钱
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;

        }

    }

    public void show (){
        System.out.println( "您的账户余额为：" + balance );
    }

    public void showAnnualRate(){
        System.out.println("年利率为： " + (annualInterestRate * 100) + "%");
    }
}
