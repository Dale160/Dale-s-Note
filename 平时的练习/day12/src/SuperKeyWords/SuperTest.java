package SuperKeyWords;

public class SuperTest {
    public static void main(String[] args) {
        Students n1 = new Students();
        n1.show();
        n1.eat();
        System.out.println("**************");

        Person p1 = new Person();
        p1.eat();
        System.out.println("************");

        Students s1 = new Students("Tome", 22,"CS");
        s1.show();



    }
}
