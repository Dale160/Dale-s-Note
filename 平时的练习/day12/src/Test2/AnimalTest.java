package Test2;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());//Animal animal = new Dog();

        test.func(new Cat());

    }

    public void func (Animal animal){
        animal.eat();
        animal.shout();
    }

//    public void func (Dog dog){  //多态性的好处，省去子类方法的重载
//        dog.eat();
//        dog.shout();
//    }

}

class Animal{

    public void eat(){
        System.out.println("动物，进食");

    }

    public void shout(){
        System.out.println("动物，叫");

    }


}
class Dog extends Animal{

    public void eat(){
        System.out.println("动物，吃东西");

    }

    public void shout(){
        System.out.println("汪汪汪");

    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("动物，吃猫粮");

    }

    public void shout(){
        System.out.println("喵喵喵");

    }
}

