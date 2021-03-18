package FinalTest;

public class FinalTest {

   final int WIDTH = 10 ;
   final int LEFT;
   final int RIGHT;
//   final int DOWN;

//    public void dowidth(){
//        width = 20; //此时报错，因为属性是final类型
//    }
{
    LEFT = 10;
}

    public FinalTest(){
      RIGHT = 2;
    }

    public FinalTest(int n){
        this.RIGHT = n;  //此时的构造器必须给final RIGHT赋值，否则如果用这个构造器创建对象，RIGHT相当于没值
        System.out.println();
    }
//
//    public void setDOWN(int DOWN){
//    this.DOWN = DOWN;
//    }  //方法中不可以使用

}



final class finalA{

}

//class B extends finalA{  //不能继承finalA，会报错
//
//}

//class c extends String{ //不能继承String类、System类、StringBuffer类
//
//}

final class AA{
    public void show(){
        final int NUM = 10;
//        NUM += 20;   //此时报错

    }

    public void show (final int num){ //final 修饰局部变量
        System.out.println(num);
    }

    public static void main(String[] args) {
        AA a1 = new AA();
        a1.show(20); //20
    }


}
//class BB extends AA{ //此时报错，不能重写的final的方法
//    public void show(){
//
//    }
//}


