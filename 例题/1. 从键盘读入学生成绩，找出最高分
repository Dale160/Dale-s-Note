/*
* 例题，从键盘读入学生成绩，找出最高分，并输入学生成绩等级。
*       成绩>=最高分-10 等级为‘A’
*       成绩>=最高分-10 等级为‘A’
*       成绩>=最高分-10 等级为‘A’
*       其余成绩为           ‘D’
*
* 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
* */


package com.atguigu.exer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

//        1.使用scanner，读取学生个数
        Scanner scan = new Scanner(System.in);//scanner实例化
        System.out.println("请输入学生的总人数：");
        int peopleNum = scan.nextInt();     // 获取学生的人数


//        2.创建数组，存储学生成绩：动态初始化

        int[] gradesData = new int[peopleNum];//创建数组存储学生的成绩


//        3.给数组中的元素赋值


        for (int i = 0; i < gradesData.length; i++) {//小于数组的位数
            System.out.println("请分别输入" + peopleNum + "个学生成绩：");
            /*int grades = scan.nextInt(); //获取学生的成绩
            gradesData[i] = grades;*/
            //或者
            gradesData[i] = scan.nextInt();

        }


//        4.获取元素中的最大值,即遍历所有的成绩
        int maxGrades = 0;

        for (int i = 0; i < peopleNum; i++) {
            if (maxGrades < gradesData[i]);
            maxGrades = gradesData[i];
        }


//        5.根据每个学生与最高分的差值,并输出等级和成绩
        char level;
        for (int i = 0; i < gradesData.length; i++) {
            if (maxGrades - gradesData[i] < 10){
                level = 'A';

            }
            else if( maxGrades - gradesData[i] < 20){
                level = 'B';
            }
            else if( maxGrades - gradesData[i] < 30){
                level = 'C';
            }
            else {
                level = 'D';
            }
            System.out.println("student " + i + " grade is: " + gradesData[i] +",Level is: " + level );

        }



    }
}
