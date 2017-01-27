package geekbrains.java_level_one.lessonOne.Home;

/**
 * Created by Wallb on 15.12.2016.
 */
public class Yers {

    public static void main(String[] args) {

        int currentyers = 296;
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

