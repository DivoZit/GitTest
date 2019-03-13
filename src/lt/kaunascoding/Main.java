package lt.kaunascoding;

public class Main {

    public static void main(String[] args) {
//
/*        int a = 6;
        System.out.println(a);
        //a++;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a); */

/*      int a = 6;
       int b = 2;
        System.out.println(a / b);
       System.out.println(a * b); */

   /*     String a = "Deividas ";
        String b = "Zitkus";
        System.out.println(a + b);
        System.out.println(a);
        System.out.println(b);  */

//        float a = 5.6f;
//        System.out.println(a + 6);


        metodas1(2, 6);
        metodas2();
        metodas3();
        metodas5("Deividas ");
        metodas4('m', '/');
        AllwaysTrue();

    }

    private static int metodas1(int a, int b) {

        System.out.println(a + b);
        return (a + b);
    }

    private static void metodas2() {
        int c = 6;
        System.out.println(c);
    }

    private static void metodas3() {
        int d = 5;
        int e = 4;
        System.out.println(d + e);
    }

    private static String metodas4(char k, char l) {
        System.out.println(k + "" + l);
        return (k + "" + l);
    }

    private static void metodas5(String x) {
        x += 9;
        System.out.println(x);
    }

    private static boolean AllwaysTrue() {
        return true;
    }
}
