package Exer;

public class PersonTest {
    public static void main(String[] args) {
        Person people = new Person();
        people.setAge(10);
        System.out.println("人的年龄是： " + people.getAge());

    }

}
class Person {
    private int age;

    //设置年龄属性
    public void setAge(int a) {
        if (a >= 0 && a <= 130) {
            age = a;
        } else {
            System.out.println("请输入正确的年龄");
        }
    }

    //获取年龄属性
    public int getAge() {
        return age;
    }
}