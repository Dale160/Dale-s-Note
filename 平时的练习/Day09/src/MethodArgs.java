public class MethodArgs {

    public static void main(String[] args) {
        MethodArgs test = new MethodArgs();
        test.show("hello");
//        test.show("hello","word");
//        test.show();



    }

    public void show (String s){
        System.out.println("show (String)");

    }

    //可变个数的形参
    public void show (String ... strs){
        System.out.println("show (String ... strs)");

    }

    //不能与上一个方法同时存在
//    public void show(String[] strs){
//
//    } 与可变个数的形参






}



