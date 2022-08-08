import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sun = sc.nextInt();
        int m = sc.nextInt();
        int tu = sc.nextInt();
        int w = sc.nextInt();
        int th = sc.nextInt();
        int f = sc.nextInt();
        int sa = sc.nextInt();
        int more,morep;
        int p1,p2=0,p3=0,p4=0,p5=0,p6=0,p7,p8=0;
        int total_r;
        p1=sun*150;
        p7=sa*125;
        if(m<=8){
            p2=m*100;
        }
        else if(m>8){
            more=m-8;
            morep=more*115;
            p2=morep+800;
        }
        if(tu<=8){
            p3=tu*100;
        }
        else if(tu>8){
            more=tu-8;
            morep=more*115;
            p3=morep+800;
        }
        if(w<=8){
            p4=w*100;
        }
        else if(w>8){
            more=w-8;
            morep=more*115;
            p4=morep+800;
        }
        if(th<=8){
            p5=th*100;
        }
        else if(th>8){
            more=th-8;
            morep=more*115;
            p5=morep+800;
        }
        if(f<=8){
            p6=f*100;
        }
        else if(f>8){
            more=f-8;
            morep=more*115;
            p6=morep+800;
        }
        int total_day=m+tu+w+th+f;
        if (total_day>40){
            int extra_day=total_day-40;
            p8=extra_day*25;
        }
        total_r = p1+p2+p3+p4+p5+p6+p7+p8;
        System.out.println(total_r);
    }
}
