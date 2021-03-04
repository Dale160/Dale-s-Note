package Exer2;
/*
* 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
* 在CheckAccount类中重写withdraw方法，其算法如下：
*   如果（取款金额<账户余额）；
*   可直接取款，
*   如果（取款金额>账户余额）
*   计算需要透支的额度
*   判断overdraft是否足够支付本次透支的需要，如果可以，
*           将账户余额修改为0，冲减可透支金额
*         如果不可以
*           提示用户超过可透支的限额
*
* */
public class CheckAccount extends Account{


    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw (double amount){
//        余额够的情况
        if (amount <= getBalance()){
//            方式一；
//            setBalance(getBalance() - amount);
//            方式二：
            super.withdraw(amount);

            //余额不够的情况
        }else if(amount > getBalance()){
            //计算透支的额度
           double limit =  amount - getBalance();

           if (limit < overdraft){
               overdraft -= limit; //这里很容易出错，应该先取钱减去透支额，再设置存款为0
               setBalance(0);


           }else
               System.out.println("用户超过可透支的限额");


        }
    }

    public void showOverdraft(){
        System.out.println("可透支的额度为：" + overdraft);
    }


}
