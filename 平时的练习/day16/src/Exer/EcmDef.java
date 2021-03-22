package Exer;

public class EcmDef {
    public static void main(String[] args) {
        try {
            int i1 = Integer.parseInt(args[0]);
            int i2 = Integer.parseInt(args[1]);

            int result = ecm(i1, i2);

            System.out.println(result);
        }catch(NullPointerException e){
            System.out.println("数据类型不一样");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");

        }catch(ArithmeticException e ){
            System.out.println("除0");

        }catch(EcDef e){
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(int i,int j) throws EcDef {
        if(i < 0 || j < 0) {
            throw new EcDef("分子或分母为负数了");
        }
        return i / j;
    }


}
