//        Есть одномерный массив из 10 элементов, заполненный случайными числами.
//        Необходимо найти число, введенное пользователем.
//        Используйте алгоритм бинарного поиска.

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 30);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.print("Введите искомое число от 0 до 30: ");
        int a = in.nextInt();

        int res = Arrays.binarySearch(arr, a);
        System.out.printf("число %d хранится под индеком %d", arr[res], res);
    }
}
