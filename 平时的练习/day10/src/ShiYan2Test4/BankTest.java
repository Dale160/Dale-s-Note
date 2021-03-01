package ShiYan2Test4;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("jane", "Smith");

        //连续操作
        //开户，并且存了2000
        bank.getCustomer(0).setAccount(new Account(2000)); //匿名对象
//        这就等于 customers[0].setAccount(a)(new Account (init_balance:2000))
//         bank.getCustomer(0)是获取用户；然后用户调用 setAccount(Account account){}方法，就是账户；
//      然后再执行匿名对象，创建一个存款2000的账号，因为构造器是public Account(double init_balance){this.balance = init_balance;}

        //取钱500
        bank.getCustomer(0).getAccount().withdraw(500);

        //余额是多少,并且赋值给balance
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + ",的账户余额为：" + balance);

        System.out.println("*******************");
        bank.addCustomer("万里","杨");

        System.out.println("银行用户的个数为：" + bank.getNumberOfCustomer());




    }
}
