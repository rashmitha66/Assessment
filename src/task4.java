import java.util.*;
//collatz sequence
public class task4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x!=1){
            System.out.print(x + " ");
            if((x&1)==1){               //odd number
                x=3*x+1;
            }
            else{
                x=x/2;
            }
        }
        System.out.print(x);
    }
}
