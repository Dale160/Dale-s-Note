package Test;

public class UserTest {
    public static void main(String[] args) {
        //1.默认和2.显示初始化
        User u1 = new User();

        System.out.println(u1.age);
        //构造器中赋值
        User u2 = new User(2);
        System.out.println(u2.age);
        //4. 通过的“对象.方法” 或者“对象.属性” 的方式赋值
        u2.setAge(3);
        System.out.println(u2.age);


    }
}

class User{
    String name;
    int age = 1;

    public User(){

    }
    public User(int a ){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }
}

