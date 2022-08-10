import java.util.*;
class CheckAgeException extends Exception{
    CheckAgeException(){
        System.out.println("Age not Valid for the nomination !");
    }
}
public class CustomException1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        try{
            if(age<25)
                throw new CheckAgeException();
            else{
                System.out.println("Age Valid for the nomination !");
            }
        }catch(Exception e){
            System.out.println(e);
        };

      //  System.out.print("continuing with rest of the code");
    }
}
