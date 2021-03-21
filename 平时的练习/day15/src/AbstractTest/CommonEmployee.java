package AbstractTest;

public class CommonEmployee extends Employee {


    @Override
    public void work() {
        System.out.println("员工在一线车间生产产品");
    }

    public CommonEmployee() {
    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }
}
