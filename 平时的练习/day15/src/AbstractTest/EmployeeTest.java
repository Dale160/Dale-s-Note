package AbstractTest;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager("Tom",1001,20000,25000);
        System.out.println(m1.getBonus());
        System.out.println(m1.getSalary());
        m1.work();

        CommonEmployee c1 = new CommonEmployee("Nick",1002,25000);
        c1.work();
    }




}
