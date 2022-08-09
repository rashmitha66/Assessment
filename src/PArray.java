import java.util.*;
public class PArray {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
//        int m=sc .nextInt();
//        int a[][] = new int[n][m];
        int n=10;
        int a[]= new int [10];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int max_index=0;
        int min_index=0;
        for(int i=0;i<10;i++){
            if(a[i]>max){
                max=a[i];
                max_index=i;
            }
            if(a[i]<min){
                min=a[i];
                min_index=i;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}