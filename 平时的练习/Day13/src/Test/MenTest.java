package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenTest {

    @Test
    void earnMoney() {
        Integer in1 = new Integer(123); //此时包装后，in1由基本数据类型，成为了Integer类
        System.out.println(in1.toString()); //此时可以调用方法toString(),并且对toString默认重写，输出int数是多少
        System.out.println(in1);

//        报异常
//        Integer in3 = new Integer("123abc"); //java.lang.NumberFormatException: For input string: "123abc"
//        System.out.println(in3.toString());


        Float f1 = new Float(12.3);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("trUe");
        Boolean b3 = new Boolean("true123");
        System.out.println(b1); //输出true
        System.out.println(b2); //输出true
        System.out.println(b3); //输出false

        /*注意布尔类型的情况，大写和小写时输出的不一样*/
        Order order = new Order();
        System.out.println(order.ismale); //false
        System.out.println(order.isFemale); //null，这时为包装类



    }
class Order{
        boolean ismale;
        Boolean isFemale;
}
    @Test
    void eat() {
        Integer in4 = new Integer(123);
        int i1 = in4.intValue(); //调用包装类的xxxValue(),此时把int4转换为int型，int 一个 i1 去接收。

        Float F4 = new Float(12.3);
        float f5 = F4.floatValue();
        System.out.println(i1 + f5);


    }

    @Test
    void walk() {
    }
}