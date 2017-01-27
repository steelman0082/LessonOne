package geekbrains.java_level_one.lessonOne;

/**
 * Created by Wallb on 15.12.2016.
 */
public class HomeLessonOne {


    public static void main(String[] args) {
        byte b = 111;
        short s = 1;
        final int i = 12;
        long l = 2;
        float f = 12.5f;
        double d = 10.12d;
        char ch = 80;
        boolean bool = false;
        String str  = "п";


        int x = 10;
        int y = 5;
        main3();
        System.out.println(main4(x, y));
        main5();
      }

    public static boolean main4(int x, int y) {
       return  ( x + y >= 10 && x + y <=20 );

    }


    public static void abcd (int a, int b, int c, int d){

        int s = 0 ;
        s = a * (b + (c/d));
        System.out.println(s);
    }

    public static void main3() {

        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        abcd (a, b, c, d);

    }


    public static void main5() {

            int currentyers = 300;
            int s = currentyers % 4;
            int sc = currentyers % 400;
            if (sc == 0 ) {
                System.out.println(currentyers + " год високосный");
            }
            if ( s == 0) {
                System.out.println(currentyers + " год високосный");
            }
            else {
                System.out.println(currentyers + " год не високосный");

            }
        }

}
