package SuperKeyWords;

public class Person {

    String name;
    int age;
    int id = 1111;//身份证号

    public Person(){

    }

    public Person(String name , int age){
        this.name = name;
        this.age = age;

    }

    public void eat(){
        System.out.println("人，吃饭");

    }
    public void walk(){
        System.out.println("人，走路");
    }





}
