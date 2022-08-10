public class ExampleException4 {
    public static void main(String args[]){
        try{
            Class.forName("Task12");

        }catch(Exception e){
            System.out.println(e);
        };

        System.out.print("continuing with rest of the code");
    }
}
