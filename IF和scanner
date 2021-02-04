# **从键盘获取数据**
Java从键盘获取的代码以及实例

步骤：
1. 导包 import java.util.Scanner;
2. Scanner实例化
3. 调用Scanner类的相关方法来获取指定类型的变量  scan.nextXxx();/scan.next() 后者为获取字符串

```csharp
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args){
        //键盘输入对象
        // scanner实例化 Scanner scan = new Scanner (System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入岳小鹏的成绩");
        int grade = scan.nextInt();

        if (grade == 100){
            System.out.println("奖励一辆BMW");
        } else if (grade > 80 && grade <= 99){
            System.out.println("奖励一台iphone");
        } else if (grade <=80 && grade >60 ){
            System.out.println("奖励一个Ipad");
        }
         else{
            System.out.println("什么东西也没有");
        }

    }

}
```
## If-else 的使用
```csharp
import java.util.Scanner;

public class IfTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //键盘输入对象

        //获取两个数中较大的值
        System.out.println("请输入第一个数");
        int a = sc.nextInt();

        System.out.println("请输入第二个数");
        int b = sc.nextInt();

        //定义一个变量接收最大值
        int max;
        if (a>b){
            max = a;
        }
        else {
            max = b;
        }
        System.out.println("最大数是" + max);
        System.out.println("-------");

        //判断一个数是奇数还是偶数
        System.out.println("输入你要判断的数据");
        int x = sc.nextInt(); //从键盘获取数据

        if (x%2 == 0) {
            System.out.println(x + "这个是数是偶数");
        }
        else System.out.println(x + "这个数是奇数");

        /*使用三元运算符比大小*/
        int num1 = 10, num2 = 20, num3 = 30;
        int max2;
        if(num1 >= num2 && num1>= num3){
            max2 = num1;

        }else if (num2>=num1 && num2>=num3){
            max2 = num2;


        }else{
            max2 = num3;
        }
        System.out.println("三个数中最大的数是" + max2);


    }

}
```
