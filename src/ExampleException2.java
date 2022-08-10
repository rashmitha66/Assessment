public class ExampleException2 {
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        try{
           for(int i=0;i<=array.length;i++){
               System.out.print(array[i]+" ");
           }

        }catch(Exception e){
            System.out.println();
            System.out.println("Exception Caught");
        };

        System.out.print("continuing with rest of the code");
    }
}
