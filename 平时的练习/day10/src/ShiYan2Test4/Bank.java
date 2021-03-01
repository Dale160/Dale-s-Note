package ShiYan2Test4;

public class Bank {

    private Customer[] customers; //存放多个客户的数组
    private int numberOfCustomer; //记录客户的个数，所以值为0

    //构造器
    public Bank(){
        customers = new Customer[10];

    }

    //添加客户， 没看明白是怎么操作的
    public void addCustomer (String f,String l){
        Customer cust = new Customer(f,l);  //这里是相当于每次调用方法就创建一个f,l的Customer属性的cust

//        customers[numberOfCustomer] = cust;  //这里是重点，难点
//        numberOfCustomer++;

        //或者
        customers[numberOfCustomer++] = cust;
        //因为numberOfCustomer是从0开始计数，所以每执行一次就＋1，
        // 然后新建的Customer类的数组 customers[0]就得到Customer类的数组 就整个赋值给cust数组，可以看上面的或者方法，容易理解

    }

    //获取客户的个数
    public int getNumberOfCustomer(){
        return numberOfCustomer;

    }

    //获取指定位置上的客户
    public Customer getCustomer(int index){
//        return customers[index]; 这样写不好，如果index越界，可能报异常
        if (index >=0 && index < numberOfCustomer){
            return customers[index];

        }
        return null;
    }
}
