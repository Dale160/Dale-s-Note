# TreeSet 练习，主要考察自然排序 和 定制排序 尚硅谷546
## 示例代码：day23 Exer546
```java
package Exer546;

/**
 * @author Dale's File
 * @creat 2021-04-05-12:00
 */
public class Employee implements Comparable{


    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee employee = (Employee)o;
            return this.name.compareTo(employee.name);
        }else {
            throw new RuntimeException("传入数据有误");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
```
