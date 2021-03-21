package Exer;

import java.util.Calendar;
import java.util.Scanner;

public class ParollSystem {
    public static void main(String[] args) {

//        方式一；
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入当月的月份");
        int month = scan.nextInt();

//        //方式二：
//        Calendar calendar = Calendar.getInstance();
//        int month = Calendar.get(Calendar.MONTH); //获取当前月份
//        System.out.println(month + 1);

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("Mas",1002,new MyDate(1992,2,28),
                10000);
        emps[1] = new HourlyEmployee("TOM",2001,new MyDate(1991,1,6),
                60,240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为：" + salary);

            if (month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励100元");
            }
        }

    }
}
