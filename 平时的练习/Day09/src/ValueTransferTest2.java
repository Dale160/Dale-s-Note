public class ValueTransferTest2 {
    public static void main(String[] args) {

        Data2 data = new Data2();
         data.m = 10;
         data.n = 20;

        System.out.println("m = " + data.m +  " n = " + data.n);

//        int temp = data.m;
//        data.m = data.n;
//        data.n = temp;


        //交换m和n的值
       data.swap(data);

        System.out.println("m = " + data.m +  " n = " + data.n);


        }

    }


    class Data2{
        int m;
        int n;


        public void swap(Data2 data) {
            int temp = data.m;
            data.m = data.n;
            data.n = temp;
        }
    }




