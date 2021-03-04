package Exer2;

/*
* 写一个用户程序测试CheckAccountTest类，在用户程序中，创建一个账号为1222,、余额为20000、年利率为4。5%，可透支限额5000
* 使用withdraw提款5000，并打印余额，和可透支余额
* 再使用withdraw提款18000，并打印余额，和可透支余额
* 使用withdraw提款3000，并打印余额，和可透支余额
* */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acct2 = new CheckAccount(1222,20000,0.045,5000);

        acct2.withdraw(5000);
        acct2.show();
        acct2.showOverdraft();
        System.out.println("***********");

        acct2.withdraw(18000);
        acct2.show();
        acct2.showOverdraft();
        System.out.println("***********");


        acct2.withdraw(3000);
        acct2.show();
        acct2.showOverdraft();
        System.out.println("***********");


    }



}
