package exceptionHandling;

public class ThrowsClass {
    public static void main(String[] args)  {
      ThrowsClass tc=new ThrowsClass();
        try {
            tc.wokeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        public void wokeup() throws InterruptedException {
        sleep();
        System.out.println("Hi");
        }
        public void sleep() throws InterruptedException {
                Thread.sleep(2000);
            System.out.println("Hurrah");
            }
            }







