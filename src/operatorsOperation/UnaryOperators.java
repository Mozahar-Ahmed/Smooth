package operatorsOperation;

public class UnaryOperators {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++);//10
        System.out.println(++i);//12
        System.out.println(i--);//12
        System.out.println(--i);//10
        //
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);//22
        System.out.println(b++ + b++);//21
        //
        int x = 10;
        int y = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~x);//-11 (minus of total positive value which starts from 0)
        System.out.println(~y);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
        //
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
        //logical && and bitwise &
        int p = 10;
        int q = 5;
        int r = 20;
        System.out.println(p < q && p < r);//false && true = false
        System.out.println(p < q & p < r);//false & true = false
        System.out.println(p > q && p < r);//true & true = true

        //assignment operator
        int g = 10;
        int h = 20;
        g += 4;//g=g+4=10+4=14
        h -= 4;//h=h-4=20-4=16
        System.out.println(g);
        System.out.println(h);

        //assignment operator

        int f = 10;
        f += 4;
        System.out.println(f);
        f -= 3;
        System.out.println(f);
        f *= 2;
        System.out.println(f);
        f /= 2;
        System.out.println(f);
        //assignment operator :adding short
        short m = 10;
        short n = 10;
        m += n;//m=m+n=10+10=20, internally so fine
        // m=(m+n); //Compile time error because 10+10=20 now int
        System.out.println(m);//20
        //assignment operator :adding short  //Type casting
        short s= 10;
        short t = 10;
        s += t;//s=s+t=10+10=20, internally so fine
        // s=(s+t); //Compile time error because 10+10=20 now int
        s= (short) (s+t);//which is integer now converted to short, problem solved!!
        System.out.println(m);//20=null;


    }
}
