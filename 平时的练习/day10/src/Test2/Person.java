package Test2;

public class Person {

    private String name;
    private int age;

//    public void setName(String n){
//        name = n;
//    }


    public void setName(String name){
        this.name = name; //调用this
    }

    public String getName(){
        return name;
    }

//    public void setAge(int age){
//        age = age; //此时前后的age都为形参age
//    }

    public void setAge(int age){
        this.age = age; //this. 理解为当前对象，即当前的年龄属性
    }

    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("人要吃饭");
//        study(); //相当于省略了this
        this.study();
    }
    public void study(){
        System.out.println("人要学习");
    }
}
