import java.util.*;
public class task3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
            }
            for(int j=i+1;j<=rows;j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
