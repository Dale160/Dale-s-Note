package Exer;

//自定义异常类

public class EcDef extends Exception{

    static final long serialVersionUID = -9898098323924L; //提供序列的版本号

    public EcDef(){

    }

    public EcDef(String message){
        super(message);
    }
}
