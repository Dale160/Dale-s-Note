package ShiYan2Test4;
/*
* 尚硅谷 综合练习2，bank的class难,和创建，还有测试
* */

public class Account {
    private double balance;

    //构造器
    public Account(double init_balance){
        this.balance = init_balance;
    }
    //方法
    //查询余额
    public double getBalance(){
        return balance;
    }

    //存钱
    public void deposit(double amt){
        if( amt > 0){
            balance += amt;
            System.out.println("存款成功");

        }
    }

    //取钱操作
    public void withdraw (double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("取钱成功");

        }else {
            System.out.println("余额不足");
        }
    }
}
