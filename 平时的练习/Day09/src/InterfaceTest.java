public class InterfaceTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();

        p1.sendEmail();
        p1.palyGame();
//匿名对象
//        new Phone().sendEmail();
//        new Phone().palyGame();
        new Phone().price = 1999;
        new Phone().showPrice();
//
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone()); //这里就是匿名对象的使用，不需要再创建一个新的对象去测试

    }
}

class PhoneMall{

    public void show(Phone phone){
        phone.sendEmail();
        phone.palyGame();
    }
}

class Phone{
    double price; //价格

    public void sendEmail(){
        System.out.println("发送邮件");


    }

    public void palyGame(){
        System.out.println("玩游戏");
    }

    public void showPrice(){
        System.out.println("手机的价格是:" + price);
    }

}
