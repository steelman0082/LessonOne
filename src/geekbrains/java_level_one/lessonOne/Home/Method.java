package geekbrains.java_level_one.lessonOne.Home;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * Created by Wallb on 15.12.2016.
 */
public class Method {

    public static boolean sum(int x, int y) {
        int z = 0;
        z = x + y;
        boolean t = true;

        if ( z >= 10 && z <=20 ) {
            t = true;}
        else {
                    t = false;}
        System.out.print(t);

         return t;

    }

    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        sum(x, y);
       System.out.println("1");

       System.out.println(stepen(2, 4));
    }
    public static int stepen(int base, int stepen){
        int result = 1;
        for (int i = 0; i < stepen; i++) {
        result *= base;         }
        return result ;
}


}