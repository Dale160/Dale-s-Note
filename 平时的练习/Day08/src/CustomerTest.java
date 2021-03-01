import java.util.Arrays;

public class CustomerTest {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        cust1.eat();
        cust1.sleep(8);

        /********************/

//测试形参是否需要设置的问题
        int[] arr = new int[]{3,4,5,6,755,66,45,62,98};
        System.out.println(Arrays.toString(arr));
        cust1.sort(arr);


        int[] arr1 = new int[]{22,94,16,33,54,98};
        System.out.println(Arrays.toString(arr1));
        cust2.sort(arr1);

         /********************/



    }
}

//客户类
class Customer{


    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
        eat();  //方法内部可以调用方法
    }

    public String getName(){

        if (age >18){ //必须返回一个值，if-else else不能丢
            return name;
        }else
            return "Tom";
    }

    public String getNation(String nation){
        String info = "我的国籍是： " + nation;
        return nation;
    }

    public void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("排序后是：" + Arrays.toString(arr));

    }



}