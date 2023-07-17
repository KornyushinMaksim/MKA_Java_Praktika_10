//        Пользователь с клавиатуры вводит зарплату сотрудников фирмы.
//        Необходимо отсортировать полученные
//        данные по возрастанию или убыванию в зависимости
//        от выбора пользователя. Выбор алгоритма сортировки
//        необходимо обосновать вашему преподавателю.

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int size = 10;
        Integer[] arr = new Integer[size];
        int value;

        // заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10000) + 1000);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("1 - по возрастанию\n2 - по убыванию");
        int a = in.nextInt();
        switch (a) {
            case 1:
                Arrays.sort(arr);
                break;
            case 2:
                Arrays.sort(arr, Collections.reverseOrder());
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
