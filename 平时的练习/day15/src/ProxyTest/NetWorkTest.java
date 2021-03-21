package ProxyTest;

public class NetWorkTest {
    public static void main(String[] args) {

        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);

        proxyServer.browser(); //对外表现是代理类调用方法，好处是代理可以做点别的工作，如check();
//        server.browser();//而不是这个代理直接自己执行，这样可以只专注自己的核心功能

    }


}

interface Network{
    public void browser();
     Server s1 = new Server();


}

//被代理类
class Server implements Network{

    @Override
    public void browser() {
        System.out.println("真实的服务器访问方法");
    }
}

//代理类
class ProxyServer implements Network{

    private Network work;
    public ProxyServer(Network work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browser() {
        check();
        work.browser();

    }
}
