# JAVA
JAVA作业

##接口程序实验

一、目的：
掌握Java中抽象类和抽象方法的定义； 
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理



二、要求：
1.在 博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。


三、关键代码
教师接口
package Two;
public interface TeacherInterface {
    public abstract void setPay(int pay);//工资
    public abstract void getPay(int pay);
}


学生接口
package Two;
public interface StudentInterface {
    public abstract void setFee(int fee);//学费
    public abstract void getFee(int fee);
}


判定是否需要贷款
public boolean Loan() {
        if ((this.pay - this.fee) < 2000) {
            System.out.println("你的收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
            return true;
        }
        System.out.println("你的收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
        return false;
    }

判定是否需要
