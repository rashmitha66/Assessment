import java.util.*;
public class one_dimentional_array_calculation {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //mean
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("Mean is " + (double)sum/(double)n);

        //median
        Arrays.sort(a);
        if(n%2 != 0){
            System.out.println("Median is " + (double)a[n/2]);
        }
        else{
            System.out.println("Median is " + (double)a[(n-1)/2]);
        }

        //mode
        int max_value=0;
        int max_count=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
              if(a[j] == a[i])
                  count++;
            }
            if(count>max_count){
                max_count=count;
                max_value=a[i];
            }
        }
        System.out.println("mode is " + max_value);
    }
}
