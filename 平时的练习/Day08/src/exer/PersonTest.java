package exer;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2); //有一个新的返回值，用一个新的变量去接收一下
        System.out.println(p1.name + "的新年龄为： " + newAge);

        System.out.println(p1.age);


        //******************************

        Person p2 = new Person();
        p2.showAge();
        System.out.println(p2.age);//0
        p2.addAge(10);
        System.out.println(p2.age);//10

    }
}

