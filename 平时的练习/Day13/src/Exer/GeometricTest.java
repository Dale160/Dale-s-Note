package Exer;
/*

定义一个测试类的GeometricTest
编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术）
编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）
*/


public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("white",1.0,2.3);
        test.displayGeometricObject(c1); //因为Circle是GeometricObject的子类，所以可以使用。

        Circle c2 = new Circle("white",1.0,2.9);
        boolean isEquals = test.equalsArea(c1,c2);
        System.out.println("c1和c2的面积是否相等" + isEquals);

//       这下面用的是匿名方法
        test.displayGeometricObject(new Circle("white",1.0,2.3)); //这里用匿名方法，和上面c1一样

        boolean isEquals2 = test.equalsArea(new Circle("white",1.0,2.3),
                new MyRectangle("white",2.3,2,2));
        System.out.println("匿名方法中的两个图形面积是否相等 " + isEquals2);



    }

    //测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject o1, GeometricObject o2 ){ //注意这里的形参是父类
        return o1.findArea() == o2.findArea();

    }

    //显示对象的面积
    public void displayGeometricObject (GeometricObject g1){
        System.out.println("面积为： " +  g1.findArea() );
        System.out.println("*************");
    }
}
