package Error;

import org.junit.Test;

public class TryCatchTest {

    @Test
    public void test1(){

        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str); //java.lang.NumberFormatException: For input string: "abc"
            System.out.println("hello-----1");

        }catch(NumberFormatException e){
//            System.out.println("出现数值转换异常了，不要着急");

            //String getMessage();处理异常方法一：
//            System.out.println(e.getMessage());

            //printStackTrace(); 出来异常方法二：
            e.printStackTrace();

        }catch(NullPointerException e){
            System.out.println("出现空指针异常了，不要着急");
        }catch(Exception e){
            System.out.println("出现异常了，不要着急");

        }
//        System.out.println(num); //此时不能调用num，因为出了try结构
        System.out.println("hello-----2");
    }

}
