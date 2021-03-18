package SingletonTest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Singleton {
    public static void main(String[] args) {
        // Bank b1 = new Bank(); //原来的样子
        Bank acct1 = Bank.getInstance();
        Bank acct2 = Bank.getInstance();

        System.out.println(acct1 == acct2); //true

    }


}

//饿汗式
class Bank{

    //1.私有化构造器,目的是避免在外部新建新的对象
    private Bank(){

    }

    //2. 内部创建类的对象
    //4. 要求此对象也必须声明为静态的 //因类调用方法返回的属性值，也必须是静态属性
    private static Bank instance = new Bank();


    //3. 提供公共的静态的方法，返回对象
    public static Bank getInstance(){ //声明成静态的，就可以通过类去调用方法，创建对象，而非对象调用方法
        return instance; //此时返回的是一个Bank属性
    }
}
