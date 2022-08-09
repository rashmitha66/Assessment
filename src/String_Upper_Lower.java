import java.util.*;
public class String_Upper_Lower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer newstring = new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                newstring.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
            else if(Character.isUpperCase(s.charAt(i))){
                newstring.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println("String after conversion is " + newstring);
    }
}
