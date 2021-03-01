package Test3;
/*
* 尚硅谷237 综合练习1
* */
public class Account {
    private int id; //账号ID
    private double balance; //余额
    private double annualInterestRate; //年利率
    //构造器
    public Account(){

    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //获取id
    public int getId(int id){
        this.id = id;
        return id;
    }

    //获取余额
    public double getBalance(double balance){
        this.balance = balance;
        return balance;
    }

    //获取年利率

    public double getAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
        return annualInterestRate;
    }

    //设置id
    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //取钱
    public void withdraw(int moneyNumber){
        if(this.balance >= moneyNumber){
            this.balance = balance - moneyNumber;
            System.out.println("成功取出：" + moneyNumber);
            System.out.println("您当前余额为： " + this.balance);

        }else {
            System.out.println("余额不够");
            System.out.println("您当前余额为： " + balance + ",您取钱数量为： "+ moneyNumber +",提款额大于您的存款");
        }

    }

    //存钱
    public void deposit(int moneyNumber){
        System.out.println("您当前余额为: " + this.balance);
        this.balance += moneyNumber;
        System.out.println("成功存入： " + moneyNumber );
        System.out.println("您存款后的余额为： " + this.balance);

    }

    public void show(){
        System.out.println("您的id是：" + id + ",您的存款为： " + balance + ",年华利率为： " + annualInterestRate);
        System.out.println();
    }
}
