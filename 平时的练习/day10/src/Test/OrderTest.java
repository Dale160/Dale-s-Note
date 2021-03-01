package Test;

public class OrderTest {
    public static void main(String[] args) {

        order orderTest = new order();

        orderTest.orderDefault = 1;
        orderTest.orderPublic = 2;
//        出了order类以后，私有的结构就不可以使用
//        orderTest.orderPrivate = 3; //所以不可用

        orderTest.methodDefault();
        orderTest.methodPublic();
//        orderTest.mehtodPrivate();//出了内部类所以不可以使用


    }
}
