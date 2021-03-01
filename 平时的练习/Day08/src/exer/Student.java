package exer;

public class Student {
    //属性
    int number;  //学号
    int state;  //年级
    int score;  //成绩

    //方法
    //输出个人信息
    public String info(){
        return "学号" + number +"年级" + state + "成绩" + score; //不用sysout，用return返回就行
    }

    //改进： 讲将上述的具体操作封装到方法中
    //遍历Student[]数组的操作

    /**
     * @Description 遍历Student[]数组的操作
     * @param stus
     */
    public void print(Student[] stus){
        for (int i = 0; i <stus.length; i++) {
            System.out.println(stus[i].info());
        }

    }


//    打印出3年级的（state值为3）的学生信息。

    /**
     * @Description 查找Student数组中指定年级学生的信息
     * @author 25177
     * @date 2021年2月22日00:25:20
     * @param stus 要查找的数组
     * @param state 要找的年级
     */
    public void searchState(Student[] stus, int state){
        for (int i = 0; i < stus.length; i++) {  //注意调用方法遍历时也要用循环结构
            if (stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }

    }


    /**
     * @descrption 给Student排序
     * @param stus
     */

    public void sort(Student[] stus){
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score){
                    //如果需要换序，交换的是数组元素，注意交换的是位置，不能是成绩
                    Student temp = stus[j]; //因为类型都是Student,所以中间交换的变量类型也应该是Student
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }

    }




}



