package AbstractTest;

public class Abstract {
    public static void main(String[] args) {

//        Person p1 = new Person(); //此时报错，不可实例化
//        p1.age = 1;


    }

}

abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature{
    String name;
    int age;

    public Person(){

    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("人，吃饭");
    }

    public void walk(){
        System.out.println("人，走路");
    }

    public abstract void show();
}

//抽象方法
class Student extends Person{

    public Student (){

    }

    public Student (String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public void show(){
        System.out.println("学生多吃点");
    }
    @Override
    public void breath(){
        System.out.println("学生多呼吸新鲜的空气");
    }


}



