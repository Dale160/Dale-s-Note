package Test;

public class order {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    private void mehtodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

}
