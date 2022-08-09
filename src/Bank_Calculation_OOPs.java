import java.util.*;
interface Account{
    void deposit(float money);
    double balance(int time,int ROI,float money);
}
class Savings implements Account{
    double bal=0;
    @Override
    public void deposit(float money) {
        bal= bal+money;
    }

    @Override
    public double balance(int time,int ROI, float money) {
        if(time<=75){
            return bal+bal*(1+(time/365)*ROI);
        }
        return bal;
    }
}
class Current implements Account {
    double bal = 0;

    @Override
    public void deposit(float money) {
        bal += money;
    }

    @Override
    public double balance(int time, int ROI, float money) {
        return bal + bal * (1 + (time / 365) * ROI);
    }
}


public class Bank_Calculation_OOPs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account type:");
        String accountant = sc.next();
        System.out.println("Time period in no. of days");
        int time = sc.nextInt();
        System.out.println("Enter your amount");
        float money = sc.nextFloat();
        System.out.println("Enter your interest");
        int ROI = sc.nextInt();
        if (accountant.equals("savings")) {
            Savings s = new Savings();
            System.out.print("Do u wanna deposit y or n?");
            String deposit = sc.next();
            if (deposit.equals("y")) {
                System.out.println("Enter deposit amount");
                float dep = sc.nextFloat();
                s.deposit(dep);
            }
            System.out.println(s.balance(time, ROI, money));
        } else {
            Current c = new Current();
            System.out.print("Do u wanna deposit? choose yes or no");
            String deposit = sc.next();
            if (deposit.equals("y")) {
                System.out.println("Enter deposit amount");
                float dep = sc.nextFloat();
                c.deposit(dep);
            }
            System.out.println(c.balance(time, ROI, money));
        }
    }
}
