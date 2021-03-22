package StudentTest;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s1 = new Student();
            s1.regist(-1001);
            System.out.println(s1);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

class Student{

    private int id;

    public void regist(int id) throws Exception {
        if (id>0){
            this.id = id;
        }else{
//            System.out.println("您输入的数据非法");
            //手动的抛出一个异常对象
//            throw new RuntimeException("您输入的数据非法！"); //手动时抛出
//            throw new Exception("您输入的数据非法！"); //编译时抛出
            throw new MyException("不能输入负数");
        }
    }
}