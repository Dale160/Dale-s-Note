package exer;
/*
3.1编写程序，声明一个method方法，在方法中打印一个10*8 的*形矩阵，在main方法中调用该方法。

3.2修改上一个程序，在method方法中，除了打印一个10*8的*型矩阵外，再计算该矩阵的面积。
*并将其作为方法返回值。在main方法中调用该方法，接收返回的面积并打印

3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩阵，
并计算该矩阵的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积并打印。



*/

public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test t1 = new Exer3Test();
//     3.1   t1.method();\

//     3.2    t1.method1();

//       3.3
        int findArea = t1.method2(2,5);
        System.out.println("面积是： " + findArea);

    }


    // 3.1
//    public void method(){
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//    }


/*//    3.2
    public int method1(){
        int chang = 0;
        int wide1 = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 8; j++) {
                System.out.print("* ");

            wide1 ++;
            }
            System.out.println();
            chang ++;

        }
        int findArea = chang * wide1;
        System.out.println("面积是： " + findArea);
        return findArea;
    }
*/

//    3.3
    public int method2(int m, int n){


        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");


            }
            System.out.println();


        }
        return m * n;


    }
}


