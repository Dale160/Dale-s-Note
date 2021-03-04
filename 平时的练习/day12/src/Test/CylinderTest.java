package Test;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setLength(3.4);
        cy.setRadius(2.1);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为：" + volume);

//        没有重写时方法时
//        double area = cy.findArea();
//        System.out.println("底面圆的面积为： "+ area);
        double area = cy.findArea();
        System.out.println("底面圆的面积为： "+ area);

    }
}
