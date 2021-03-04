package Test2;

/*
*
*
* */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Men m1 = new Men();
        m1.eat();
        m1.age = 25;
        m1.earnMoney();
        System.out.println("******************");

        //**********************

        //  这就是多态性，或者对象的多态性： 父类的引用指向子类的对
        Person p2 = new Men(); //


        //堕胎的使用：点调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ---虚拟方法调用
        p2.eat(); //此时的方法为子类的方法

//        p2.earnMoney();// 因为父类里没有这个方法，所以不能用，不能调用子类的方法
    }

}
