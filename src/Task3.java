//        Есть одномерныймассив из 15 элементов, заполненный
//        случайными числами. Необходимо первые 7 элементов
//        отсортировать по возрастанию, оставшиеся 8 элементов
//        по убыванию. Выбор алгоритма сортировки необходимо
//        обосновать вашему преподавателю.

import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[15];

        //заполнение
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, 0, 7);
        Arrays.sort(arr, 7, arr.length, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}

