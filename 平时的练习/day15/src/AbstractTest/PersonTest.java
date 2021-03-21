package AbstractTest;

public class PersonTest {
    public static void main(String[] args) {

        method(new Student());//匿名对象

        Worker worker = new Worker();
//        method1(worker); //非匿名的类，非你们的对象

//************这下面是匿名子类
        Person p = new Person(){

            @Override
            public void show() {
                System.out.println("工人，吃饭");

            }

            @Override
            public void breath() {
                System.out.println("工人，呼吸");
            }
        };
        method1(p); //这里调用方法,整个这个方法叫做匿名子类对象
    }

    //**********************↑上面是


    public static void method1(Person p ){
        p.show();
        p.breath();
    }


    public static void method(Student s){


    }


}

class Worker extends Person{


    @Override
    public void breath() {

    }

    @Override
    public void show() {

    }
}



