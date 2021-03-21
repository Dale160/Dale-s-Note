package InnerClass;

public class InnerClass {

    public static void main(String[] args) {
        //创建Dog 实例（静态的成员内部类）
        Person.Dog d1 = new Person.Dog();
        d1.show();

        //创建一个鸟 (非静态内部类，先创建外部类对象，再创造非静态内部类)
        Person p1 = new Person();
        Person.Bird b1 = p1.new Bird();
        b1.sing();

        b1.display("外部形参");
    }

}

class Person{

    String name = "TOM";
    int age = 8;

    public void eat(){
        System.out.println("人，吃");
    }

    //静态-成员内部类
     static class Dog {

        String name;
        int age;


        public void show(){
            System.out.println("狗");

        }

    }
    //非静态-成员内部类
    final class Bird{
        String name = "喜鹊";

        public Bird(){


        }
        public void sing(){
            System.out.println("鸟，唱歌");
            Person.this.eat(); //调用外部类的属性
        }

        public void display(String name){

            System.out.println(name); //方法内部形参
            System.out.println(this.name); //鸟
            System.out.println(Person.this.name); //人
            System.out.println(age); //人 因为无属性名冲突

        }

    }

    //局部内部类
    public void method(){

        class AA{

        }
    }


    //局部内部类
    {
        class BB{

        }
    }

    //局部内部类
    public Person(){
        class CC{

        }
    }
}
