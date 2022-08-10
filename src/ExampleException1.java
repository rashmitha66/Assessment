import java.util.*;
import java.lang.ArithmeticException;
public class ExampleException1 {
    public static void main(String args[]){
        try{
            int exception=10/0;

        }catch(Exception e){
            System.out.println(e);
        };

        System.out.print("continuing with rest of the code");
    }

}

