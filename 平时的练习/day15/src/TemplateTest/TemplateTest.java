package TemplateTest;

public class TemplateTest {
    public static void main(String[] args) {

        Template t1 = new SubTemplate();

        t1.spendTime();

    }



}
abstract class Template{

    //计算某段代码执行所需要花费的时间

    public void spendTime(){

        long start = System.currentTimeMillis();

        this.code(); //不确定的部分（易变的部分） //钩子方法，或者回钓方法

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为： " + (end - start));
    }

    public abstract void code();

}

class SubTemplate extends Template{


    @Override
    public void code() { //取1000以内的质数

        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j < Math.sqrt(i); j++) { //开方i

                if (i % j == 0){
                    isFlag = false;
                    break;
                }

            }
            if(isFlag){
                System.out.println(i);
            }
        }

    }
}
