package exception1;

public class Lab3 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (Exception e){
            System.out.println("Statement 4");
        }
        finally {
            System.out.println("Statement 5");
        }

    }
}
