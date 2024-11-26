package Chapter_5;

import java.util.Arrays;

public class Main_102 {

    public static void main(String[] args) {

        /* Сравнение двух массивов лексикографически */
        // Используется для сравнения двух последовательностей элементов (например, массивов или строк) в порядке, подобном тому, как слова сравниваются в словаре.
        // При таком сравнении мы получаем
        // 0 - если массивы ровны и содержут одинаковые элементы в одинаковом порядке
        // значение меньше 0, если первый массив лексикографически меньше второго массива;
        // значение больше 0, если первый массив лексикографически больше второго массива.

        int [] arr1 = {1,2,3,4,5,6,7,8};
        int [] arr2 = {1,2,3,4,5,6,7,8};
        int [] arr3 = {1,2,3,4,5,6,7,3};

        int x1 = Arrays.compare(arr1, arr2);
        System.out.println(x1); // 0

        int x2 = Arrays.compare(arr1, arr3);
        System.out.println(x2);







    }

}
