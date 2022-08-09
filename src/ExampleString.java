import java.util.*;
public class ExampleString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();

        //length
        int l= a.length();
        System.out.println("length is " + l);

        //reverse
        char c[]=a.toCharArray();
        String r="";
        for(int i=c.length-1;i>=0;i--){
            r+=c[i];
        }
        System.out.println("reverse is " + r);

        //concat
        String b="hello";
        System.out.println("string after concat is " + a.concat(b));

        //split
        String z="yours bag";
        String [] sp = z.split("s",0);
        for(String i: sp)
            System.out.print("after splitting : " + i +" ,");
        System.out.println();

        //check string equal or not
        String ch="none";
        System.out.println("string compare after comparing with input string  is " + a.equals(ch));
    }
}
