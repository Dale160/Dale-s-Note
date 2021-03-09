package Test;

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

//        p2.earnMoney();// 因为父类里没有这个方法，所以不能用，不能调用子类的方法、属性，因为p2就是Person的类型

        //有了对象的多态性以后，实际上内存中是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致编译时
        //只能使用父类中声明的类型和方法。子类特有的属性和方法不能调用

        //如何才能调用子类所持有的属性和方法呢？
        //向下转型，使用强制类型转换符

        Men m2 = (Men) p2;
        m2.earnMoney();
        m2.eat();
        System.out.println("***************");

        //使用强转时，可能出现ClassCastException的异常。
/*
* //instanceof关键字的使用
*
*   a instanceof A:判断对象是否是A的实例。如果是，返回true；如果不是返回false
* 使用情景，为了在壁面向下转型出现出现ClassCastException的异常，我们在向下转型之前，先进行instanceof判断
* 一旦返回ture，就进行向下转型。如果返回false，则不向下转型。
*
*如果a instanceof A 返回true，则a instance B 也返回true
* 其中B类是A类的父类
*
*
* */
    if (p2 instanceof Woman){
        Woman w1 = (Woman) p2;
        w1.goShopping();
        System.out.println("女的活的");
        }
    if (p2 instanceof Men){
            Men m3 = (Men)p2;
            m3.earnMoney();
            System.out.println("男的活的");
        System.out.println("**************************************");
        }


        //练习：
        // 编译通过，运行不通过
        Person p3 = new Woman();
//        Men m4 = (Men)p3; //此时编译正确，运行报错，new的是同等地位的子类，不能强转
//        //举例二：
//        Person p4 = new Person();
//        Men m4 = (Men)p4;  //new 的是父类，就不能调用子类

        //问题二：编译通过，运行也通过,这个在开发中可以
        Object obj = new Woman();
        Person p = (Person)obj;//相当于 Person p = new Woman()
        p.eat(); //此时方法调用的还是Woman（）的方法

        //问题三： 编译不能通过
//        Men m5 = new Woman();// 同等地位子类，错误的使用



    }






}
