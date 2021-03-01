package exer;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象
        Student stus[] = new Student[20]; //创建学生类型数组去存放学生

        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();  //如何同时创建20个学生

            //给Student对象的属性赋值
            stus[i].number = (i + 1);
            //年级在[1,6]
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);//整个大括号不能省
            //成绩：[0,100]
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));


        }


        //遍历一下创建的学生
        for (int i = 0; i < stus.length; i++) {
//            System.out.println(stus[i].number + ","+ stus[i].state + "," + stus[i].score);
            //或者用方法定义一个
            System.out.println(stus[i].info());

        }
        System.out.println("*************");


        //问题一：打印出3年级的（state值为3）的学生信息。
        for (int i = 0; i < stus.length; i++) {  //注意调用方法遍历时也要用循环结构
            if (stus[i].state == 3) {
                System.out.println(stus[i].info());
            }
        }
        System.out.println("*******************");

        //问题二：使用冒泡排序按学生成绩排序，并遍历所有信息
        //冒泡排序

        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    //如果需要换序，交换的是数组元素，注意交换的是位置，不能是成绩
                    Student temp = stus[j]; //因为类型都是Student,所以中间交换的变量类型也应该是Student
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
        //遍历
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());


            //测试方法
            Student test = new Student();
            test.print(stus);
            test.searchState(stus,3); //光标移动到上面会有信息显示


        }


    }
}







