package exception.handling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num = 10;
        try {
            int result = 10 / 0;
            System.out.println("result is : " + result);
        }catch (Exception ex){
            System.out.println("you are not allowed to divide a number by zero");
        }
        System.out.println("we are up to this program");
    }
}
