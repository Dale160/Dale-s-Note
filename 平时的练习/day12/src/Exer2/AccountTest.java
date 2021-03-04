package Exer2;
/*
* 写一个用户测试Account类。在用户程序中，创建一个账号为1122.余额为20000，年利率为4.5%的Account对象
* 使用withdraw方法提款30000元，并打印余额
* 再使用withdraw方法提款2500
* 使用deposit方法存款3000元，然后打印余额和月利率
*
* */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(1122,20000.0,0.045);

        acct.withdraw(30000);
        acct.show();

        acct.withdraw(2500);
        acct.show();

        acct.deposit(3000);
        acct.show();

        acct.showAnnualRate();



    }
}
