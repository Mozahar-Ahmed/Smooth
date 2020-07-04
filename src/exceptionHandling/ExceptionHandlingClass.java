package exceptionHandling;

public class ExceptionHandlingClass {
    public static void main(String[] args) {
//uncaught exception
        try{
            int i = 5/0;
            System.out.println(i);
        }catch(ArithmeticException ae){
            ae.printStackTrace();
            ae.getMessage();
            System.out.println("adrnv");
        }
          System.out.println("hey This is exception handling");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
      }

    }

