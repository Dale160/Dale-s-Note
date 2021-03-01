public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();
        test.getSum(1,2);
    }

    //如下的四个方法构成了重载
    public void getSum(int i, int j){
        System.out.println(1);

    }
    public void getSum(double d1,double d2){
        System.out.println(2);
    }

    public void getSum(String s, int i){
        System.out.println(3);
    }

    public void getSum(int i ,String s){
        System.out.println(4);
    }

//    public int getSum(int i, int j){
//        return 0;
//    }  这个不可以

//    /*public void getSum (int m ,int n){
//
//    }*///方法体重名，参数相同，这时与参数的名字无关，依旧会被认为是相同方法
//






}
