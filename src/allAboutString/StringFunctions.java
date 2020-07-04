package allAboutString;

public class StringFunctions {
    public static void main(String[] args) {
        //String charAt() >>The java string charAt() method returns a char value at the given index number.
        String s1="Mozahar";
        System.out.println(s1.charAt(2));// z : index number, starts with 0
        //compareTo()
        String s2="Mozahar";
        String s3="Mozahar";
        String s4="Shajahar";
        String s5="Habib";
        System.out.println(s2.compareTo(s3));//as s2==s3>>o : lexicographically equal (a=1....z=26)
        System.out.println(s2.compareTo(s4));//-6>> lexicographically m is 6 times lower than s
        System.out.println(s2.compareTo(s5));//5>> lexicographically m is 5 times upper than H
        //concat() >>combines specified string at the end of this string. It returns combined string. It is like appending another string.
        String s6="String is";
        String s7=" immutable";
        String s8=", You know";
        String s9=s6.concat(s7);
        System.out.println(s9);
        String s10=s9.concat(s8);
        System.out.println(s10);
       String s11=s10.concat("?");
        System.out.println(s11);
        //equals() >>compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
        String s12="Mozahar";
        String s13="Mozahar";
        String s14="MOZAHAR";
        String s15="Mahbuba";
        System.out.println(s12.equals(s13));//true because content and case is same
        System.out.println(s12.equals(s14));//false because case is not same
        System.out.println(s2.equals(s15));//false because content is not same
        //equalsIgnoreCase>>method compares the two given strings on the basis of content of the string irrespective of case of the string.
    String st= "Mozahar";
    String st1= "MOZAHAR";
    String st2= "Mahbuba";
        System.out.println(st.equalsIgnoreCase(st1));//true because case is ignored
        System.out.println(st.equalsIgnoreCase(st2));//false because content is not same
    }
}
