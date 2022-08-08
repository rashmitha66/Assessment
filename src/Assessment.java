import java.util.*;
public class Assessment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
//        int p = x - n;
//        int q = y - n;
//        int r = z - n;
//        if (p >= 0 && q >= 0 && r >= 0) {
//            if (p < q && p < r) {
//                System.out.println("L1");
//            } else if (q <= p && q <= r) {
//                System.out.println("L2");
//            } else if (r <= p && r <= q) {
//                System.out.println("L3");
//            }
//        } else {
//            System.out.println("None");
//        }
        if(n<=x){
            System.out.println("L1");
        }
        else if(n<=y){
            System.out.println("L2");
        }
        else if(n<=z){
            System.out.println("L3");
        }
        else{
            System.out.println("none");
        }
    }
}
