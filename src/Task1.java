//        Два одномерных массива заполняются случайными числами.
//        Необходимо:

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int size1 = 6;
        int size2 = 5;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int sizeRes = arr1.length + arr2.length;
        int[] arrRes = new int[sizeRes];
        int k = 0;
        boolean flag = true;


//      заполнение и вывод массивов arr1 и arr2

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

//      ■ Сформировать третий массив, содержащий элементы обоих массивов;

        System.arraycopy(arr1, 0, arrRes, 0, arr1.length);
        System.arraycopy(arr2, 0, arrRes, arr1.length, arr2.length);
        System.out.println("\nмассив, содержащий элементы обоих массивов\n" + Arrays.toString(arrRes) + "\n");

//      ■ Сформировать третий массив, содержащий элементы обоих массивов без повторений;

        Arrays.fill(arrRes, 0);
        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            if (arr1[i] == 0 && flag) {
                arrRes[k++] = arr1[i];
                flag = false;
            }
            for (int j = 0; j < sizeRes; j++) {
                if (arr1[i] != arrRes[j]) {
                    count++;
                }
            }
            if (count == sizeRes) {
                arrRes[k++] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            int count = 0;
            if (arr2[i] == 0 && flag) {
                arrRes[k++] = arr2[i];
                flag = false;
            }
            for (int j = 0; j < sizeRes; j++) {
                if (arr2[i] != arrRes[j]) {
                    count++;
                }
            }
            if (count == sizeRes) {
                arrRes[k++] = arr2[i];
            }
        }
        int[] arrTemp = new int[k];
        System.arraycopy(arrRes, 0, arrTemp, 0, k);
        System.out.println("\nмассив, содержащий элементы обоих массивов без повторений\n" + Arrays.toString(arrTemp));

//        ■ Сформировать третий массив, содержащий только уникальные элементы каждого из массивов;

        Arrays.fill(arrRes, 0);
        k = 0;
        for (int i = 0; i < arr1.length; i++) {
            int count = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] != arr1[j]) {
                    for (int f = 0; f < sizeRes; f++) {
                        if (arr1[i] != arrRes[f]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            if (count == arr1.length - 1) {
                arrRes[k++] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            int count = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] != arr2[j]) {
                    for (int f = 0; f < sizeRes; f++) {
                        if (arr2[i] != arrRes[f]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            if (count == arr2.length - 1) {
                arrRes[k++] = arr2[i];
            }
        }
        int[] arrTemp1 = new int[k];
        System.arraycopy(arrRes, 0, arrTemp1, 0, k);
        System.out.println("\nмассив, содержащий только уникальные элементы каждого из массивов\n"
                + Arrays.toString(arrTemp1));

//        ■ Сформировать третий массив, содержащий только
//        минимальное и максимальное значение каждого из
//        массивов.

        Arrays.fill(arrRes,0);
        k = 0;
        int min = arr1[0];
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++){
                if (max < arr1[i]){
                    max = arr1[i];
                }
                if (min > arr1[i]){
                    min = arr1[i];
                }
        }
        int max1, min1;
        max1 = min1 = arr2[0];
        for (int i = 0; i < arr2.length; i++){
                if (max1 < arr2[i]){
                    max1 = arr2[i];
                }
                if (min1 > arr2[i]){
                    min1 = arr2[i];
                }
        }
        arrRes[k++] = min;
        arrRes[k++] = max;
        arrRes[k++] = min1;
        arrRes[k++] = max1;
        int[] arrTemp2 = new int[k];
        System.arraycopy(arrRes, 0, arrTemp2, 0, k);
        System.out.println("\nмассив, содержащий только\n" +
                "минимальное и максимальное значение каждого из\n" +
                "массивов\n"
                + Arrays.toString(arrTemp2));

    }
}
