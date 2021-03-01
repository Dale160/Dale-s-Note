package Test;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "大黄";
        //age = 1;
        a.setAge(1);

//        a.legs = 4; //加了以后此时这里会报错

        a.show();

//        a.legs = -4;   // 禁止用户使用这样的赋值方式，使用private给legs
//        a.setLegs(6);  // legs = 6
//        a.setLegs(-6); //legs = 0

        a.show();

    }


}

class Animal{

    String name;
    private int age;
//    int legs;//腿的个数
    private int legs; //此时相当于对这个属性进行了封装，使得外界无法看到它，用方法进行调用



    //保证腿的个数不是负数
    //对属性的设置
    public void setLegs(int l){
        if (l >= 0 && l % 2 == 0){
            legs = l;
        }else {
            legs = 0;
            //抛出一个异常(暂时没讲)
        }
    }

    //对属性的获取
    public int getLegs(){
        return legs;
    }

    //提供关于age和get和set的方法
    //对年龄的获取
    public int getAge(){
        return age;
    }

    //对年龄的设置
    public void setAge(int a){
        if (a >= 0 && a<= 150){
            age = a;
        }else{
            System.out.println("请输入正确的年龄");
        }
    }


    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
    }

}
