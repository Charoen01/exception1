package exception1;

public class Lab5 {
    public static void main(String[] args) {
        System.out.println("Main medthod call method doThis");
        try{
            doThis();
        }
        catch (Exception e){
            System.out.println("Main method receive exception"+ e.getMessage());
        }
    }
        public static void doThis () throws Exception {
            System.out.println("Method doThis call Method doThat");
            doThat();
        }
        public static void doThat () throws Exception {
            throw new MyException("Hello exception");

        }


}