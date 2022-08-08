import java.util.*;
//Dora
public class task5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[row][col];
        int k=0;
        for(int i=0;i<row;i++){
            a[i][0]=-1;
            a[i][col-1]=-1;
        }
        for(int i=0;i<col;i++){
            a[0][i]=-1;
        }
        int count=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(count++==n){
                    if(a[i][j]==-1){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
