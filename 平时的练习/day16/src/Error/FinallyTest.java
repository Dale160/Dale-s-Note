package Error;

import org.junit.Test;

public class FinallyTest {

    public int method(){


        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;

        }catch(ArrayIndexOutOfBoundsException e){
            e.getStackTrace();
            return 2;

        }finally{
            System.out.println("我一定会被执行");
            return 3;
        }

    }

    @Test
    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch(ArithmeticException e){
            e.printStackTrace();

            int[] arr = new int[10];
            System.out.println(arr[10]);

        }catch (Exception e){
            e.printStackTrace();

        }finally{
            System.out.println("我好帅啊");
        }
//        System.out.println("我好帅啊");
    }

    @Test
    public void methodTest(){
        int num = method();
        System.out.println(num);
    }

    @Test
    public void test2(){
        //尚硅谷376 14；00处
    }

}
