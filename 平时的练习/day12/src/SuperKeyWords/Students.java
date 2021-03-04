package SuperKeyWords;

public class Students extends Person{

    String major;
    int id = 1002; //学号 （即属性不会覆盖父类的属性，会同时存在）

    public Students(){

    }

    public Students(String major){
        this.major = major;
    }

    public Students(String name, int age ,String major){

//        this.name = name; //当权限放开时可以这么写
//        this.age = age;
        super(name,age); //调用父类同形参类型的构造器，而且必须放在整个方法的开头
        this.major = major;

    }

    @Override
    public void eat() {
        System.out.println("学生，多吃有营养的食物");
        super.eat();

    }

    public void study(){
        System.out.println("学生，学习知识");
    }

    public void show(){
        System.out.println("name = " + this.name + ",age = " + super.age);
        System.out.println("学号是： " + id);
        System.out.println("身份证号是： " + super.id);

    }


}
