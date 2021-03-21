package Exer2;

public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o; //强转
            //错误的，有漏洞
//            return (int) (this.getRadius() - c.getRadius());

            //正确的
            if (this.getRadius() > c.getRadius()){
                System.out.println("前者半径大");
                return 1;
            }else if (this.getRadius() < c.getRadius()){
                System.out.println("前者半径小");
                return -1;
            }else
                System.out.println("两个半径一样");
                return 0;


        }else{
//            return 0;
            throw new RuntimeException("传入的数据不匹配");
        }
    }
}
