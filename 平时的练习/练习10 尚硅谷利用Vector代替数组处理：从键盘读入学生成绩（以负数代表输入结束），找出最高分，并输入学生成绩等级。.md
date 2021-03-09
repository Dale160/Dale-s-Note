# 练习10 尚硅谷利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输入学生成绩等级。
 > 提示： 数组一旦创建，长度就固定不变，所以在创建数组钱就知道它的长度。而向量java.util.Vector 可以根据需要动态伸缩。
       创建Vector对象：Vector v = new Vector();相当于原来的数组
       给向量元素添加
       
```java
/*
* 练习10 尚硅谷310
* 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输入学生成绩等级。
*   提示： 数组一旦创建，长度就固定不变，所以在创建数组钱就知道它的长度。而向量java.util.Vector 可以根据需要动态伸缩。
*       创建Vector对象：Vector v = new Vector();相当于原来的数组
*        给向量元素添加
* */

package InterviewTest;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {

        //1. 实例化Scanner，用于从键盘获取学生成绩
        Scanner scan = new Scanner(System.in);

        //2. 创建Vector对象： Vector v = new Vector();相当于原来的数组
        Vector v = new Vector();

        //3. 通过for()或while()的方法，给Vector中添加数组
        int maxScore = 0;
        for(;;){
            System.out.println("请输入学生的成绩（以负数代表结束）");
            int score = scan.nextInt();

            if (score >100) {
                System.out.println("输入的数据非法，请重新输入");
                continue;//让重程序继续

            }else if(score > 0 && score < 100) {

                //3.1添加操作：v.addElement(object obj)
//                //jdk 5.0之前
//                Integer inScore = new Integer(score);
//                v.addElement(inScore); //这个方法只能装 class 类

                //Jdk 5.0之后
                v.addElement(score); //自动装箱

                //3.2 当输入是负数时，跳出循环
            }else if (score < 0){
                break;
            }

            //4.获取学生成绩的最大值
            if (maxScore < score){
                maxScore = score;
            }



        }



        // 5. 遍历每个学生的成绩，并与最大成就比较，得到每个学生的等级
        char level = 0;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            //jdk 5.0之前
//            Integer inScore = (Integer)obj; //将obj类型的强转为 Integer
//            int score = inScore.intValue();

            //jdk 5.0之后
            int score = (int)obj; //直接将obj类转为int 而非 obj - Integer - obj

            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20) {
                level = 'B';
            }else if(maxScore - score <= 30) {
                level = 'C';
            }else if(maxScore - score <= 40) {
                level = 'D';
            }
            System.out.println("Student- " + i + "Score is " + score + "Level is " + level);
        }

    }



}
```
