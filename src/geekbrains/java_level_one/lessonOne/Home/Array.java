package geekbrains.java_level_one.lessonOne.Home;

import java.util.Arrays;

//        1.	Создать массив, состоящий из элементов 0 и 1, например, int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
//        2.	В массиве из предыдущего пункта с помощью цикла заменить 0 на 1, 1 на 0;
//        3.	Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
//        4.	Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
//        5.	* Задать одномерный массив и найти в нем минимальный и максимальный элементы;
//        6.	** Написать простой консольный калькулятор. Пользователь вводит два числа и операцию, которую хочет выполнить, программа вычисляет результат и выводит в консоль;


/**
 * Created by Wallb on 16.01.2017.
 */
public class Array {

    public static void change (int[] array) {
        for (int i = 0; i <array.length ; i++) {
            array [i] = (array [i] == 0) ? 1 : 0;
        }
    }

    public static void fillIn (int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i * 3 + 1;

    }

    public static void finn (int [] array) {
        for (int i = 0; i <array.length ; i++) {
            array[i] = i * 3 + 1;
        }

    }

    public static void dublind (int[] array ) {
        for (int i = 0; i < array.length ; i++) {
            if (array [i] <= 6) array [i] *= 2;
        }

    }

    public static int max (int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = (array[i] > max) ? array[i] : max;
                    }
        return max;
    }

    public static void mix(int[] array) {


    }


    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(arr.length);

        // 2. Пробегаем по стрингу и меняем в нём значения 1 на 0 и 0 на 1.
        change(arr);
        System.out.println(Arrays.toString(arr));

        int[] arrayX = new int[8];
        // 2
        int[] arrInt = new int[8];
        fillIn(arrInt);
        System.out.println(Arrays.toString(arrInt));

        // 3
        int[] mas = { 1, 5, 3, 2, 15, 4, 5, 2, 4, 8, 9, 1 };
        dublind(mas);
        System.out.println(Arrays.toString(mas));

        max(mas);
        System.out.println(max(mas));


    }


    }



