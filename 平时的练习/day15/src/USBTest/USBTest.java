package USBTest;

public class USBTest {

    public static void main(String[] args) {
        Computer c1 = new Computer();

        //1. 创建了接口的非匿名实现类的非匿名对象。
        Flash flash = new Flash();
        c1.transferDate(flash);

        //2. 创建了接口的非匿名实现类的匿名对象
        c1.transferDate(new Printer());

        //3. 创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        c1.transferDate(phone);

        //4. 创建了接口的匿名实现类的匿名对象
        c1.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });
    }

}

class Computer{
    public void transferDate(USB usb){
        usb.start();

        System.out.println("具体传输的细节");

        usb.stop();
    }
}

interface USB{

    //常量：定义了长、宽、最大最小的传输速度等

    void start();
    void stop();

}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
