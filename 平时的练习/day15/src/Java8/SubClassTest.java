package Java8;

public class SubClassTest implements CompareA{
    public static void main(String[] args) {

        SubClass s1 = new SubClass();

//        s1.method1();
        //知识点1： 接口中定义的静态方法，只能通过接口来调用
        CompareA.method1();

        //知识点2：通过实现类的对象，可以调用接口中的默认方法
        //如果实现类重写了接口中的默认方法，调用时，任然调用的是重写以后的方法（类似继承）
        s1.method2();

        //知识点3： 如果子类（或实现类）继承的父类和实现的接口中声明了同名同参数的方法时，
        //          那么子类在没有重写此方法的情况下，默认调用的是父类。
        //          但是现在报错啦视频太老了，实际上是会提示说不能用

        s1.method3();
    }
}

interface CompareA {

    //静态方法： 通过接口来掉
    public static void method1(){
        System.out.println("Compare A: 北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("Compare A: 上海");
    }

    default void method3(){ //public 可以省略
        System.out.println("Compare A: 上海");
    }


}

class SubClass implements CompareA{ //
    // class SubClass extends SuperClass implements CompareA//这个是报错的
    public void method2(){
        System.out.println("SubClass: 上海");
    }


}
class SuperClass{

    void method3(){
        System.out.println("SuperClass: 北京");
    }

}


