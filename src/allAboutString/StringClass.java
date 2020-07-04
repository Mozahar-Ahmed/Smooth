package allAboutString;

public class StringClass {
    public static void main(String[] args) {
        //Payment $500 paid
        //creating object in a special style  //only possible in the string class
        String string="payment $500 paid";
        //normal fashion of creating object
        String str = new String("Payment $500 paid");
        System.out.println(string.charAt(8));
        System.out.println(string.indexOf("t"));
        System.out.println(string.indexOf("5"));
        System.out.println(string.substring(8));

    }
}
