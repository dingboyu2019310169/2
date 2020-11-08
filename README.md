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


三、结构
结构分为两个接口和主类——博士生类。接口中有老师和学生，这里用于存放学费和收入。博士生类继承接口中定义的学费和工资，博士生既可以挣工资又可以交学费，当他挣得工资不够交学费时需要启动贷款，当他挣的工资大于学费时又需要纳税，那税金就是工资减学费。

四、关键代码
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

判定是否需要交税
 boolean TF = graduate.Loan();
            if (TF) { System.out.println("你需要贷款"); }
            else { System.out.println("你需要交税" + "金额为:" + (pay - fee) + "元"); }
            
            
五、实验感想
这次试验我清楚了接口的继承方法，接口的结构，此外我还学会了用scanner类运行交互输入，和布尔类函数使用方法。接口比类继承要简单，但当它里面的方法是抽象类时，抽象类既可以直接拥有方法，也可以重写方法，而非抽象类来说，它必须重写接口的所有方法。而这个程序中就是用接口间接访问了fee,pay两个变量，接口一旦实现，就可以在类中使用。此外接口还可以被继承，就像继承类一样也是一一对应地继承。
布尔函数里面会判断函数是否为真，是真真值是1，是假真值就是0，用布尔函数的真值可以调用别的函数。
scanner类呢，需要在类前提前声明，对比于C中的scanf有些麻烦，他是输入数据的一个类，应该算是库中的类吧，用了这个类就可以随意输出参数了！
总而言之这次实验我学会了很多东西，实验过程虽然累，但我感觉很充实！
            
            
