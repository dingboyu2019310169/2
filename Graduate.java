package Two;
import java.util.Scanner;
public class Graduate  implements StudentInterface, TeacherInterface {
    private String name;
    private String sex;
    private String age;
    private int fee;//学费
    private int pay;//工资
    public void setPay(int pay)
    { this.pay = pay;
        System.out.println("你的收入为：" + this.pay); }
    public void getPay(int pay)
    { this.pay = pay;
        System.out.println("你的收入为：" + this.pay); }
    public void setFee(int fee)
    { this.fee = fee;
        System.out.println("你的学费为：" + this.fee); }
    public void getFee(int fee)
    { this.fee = fee;
        System.out.println("你的学费为：" + this.fee); }

    public boolean Loan() {
        if ((this.pay - this.fee) < 2000) {
            System.out.println("你的收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
            return true;
        }
        System.out.println("你的收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
        return false;
    }

        public static void main(String[] args) {
            Graduate graduate = new Graduate();
            graduate.name = "张三";
            graduate.age = "18";
            graduate.sex = "男";
            System.out.println(graduate.name + graduate.age + graduate.sex);

            Scanner scanner = new Scanner(System.in);
            System.out.println("收入是：");
            int pay = scanner.nextInt();
            graduate.setPay(pay);

            System.out.println("学费是：");
            int fee = scanner.nextInt();
            graduate.setFee(fee);

            // 判断是否需要交税
            boolean TF = graduate.Loan();
            if (TF) { System.out.println("你需要贷款"); }
            else { System.out.println("你需要交税" + "金额为:" + (pay - fee) + "元"); }
        }
    }
