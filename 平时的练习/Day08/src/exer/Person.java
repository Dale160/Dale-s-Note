package exer;

public class Person {
    String name;
    int age;

/**
* 取1的时候为男
* 取0的时候为女
* **/
    int sex;

    public void study(){
        System.out.println("Studying");
        return;

    }

    public void showAge(){
        System.out.println("age" + age);

    }

    public int addAge(int i){
        age += i;
        return age;

    }

}
