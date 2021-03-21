package Exer2;

/*
*
* 不知道为什么报异常，无法进入判断 尚硅谷359
*
*
* */

public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(3.4);
        Circle c2 = new Circle(3.6);


        int compareValue = c1.compareTo(c2);

        if (compareValue > 0){
            System.out.println("c1 大");

        }else if(compareValue < 0){
            System.out.println("c2 大");

        }else if(compareValue == 0){
            System.out.println("一样大");
        }



    }
}
