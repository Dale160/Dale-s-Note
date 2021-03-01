public class ValueTransferTest {
    public static void main(String[] args) {


        int m = 10;
        int n = 20;
        System.out.println("m = " + m + " " + "n = " + n);


        ValueTransferTest test = new ValueTransferTest();

        test.swap(m, n);//按理来说会改变m,n 但是实际不会。
        System.out.println();
        System.out.println("真实main方法中的m和n是：" + "m = " + m + " " + "n = " + n);

//        public void swap(int[] arr ) {
//            int temp = m;
//            m = n;
//            n = temp;
//
//        }


    }


    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("swap方法中运行完以后的m和n是：" + "m = " + m + " " + "n = " + n);
//        此时传递给形参的是两个基本数据类型，在栈空间中交换，但是在堆空间中并没有交换，所以在结束以后，
//        栈空间的变量会被系统抹除，堆空间的实际数值依然没变
    }


    class Data {

        int m;
        int n;

        //正确的，交换数组中指定两个位置元素的值

    }
}

