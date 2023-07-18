//        В двумерном массиве, заполненном случайными числами,
//        определить минимальный и максимальный элементы для каждой строки.
//        Результаты вывести на экран.

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        Matrix arr = new Matrix(5,5);
        arr.initMatrix();
        arr.printMatrix();
        int min, max;

        System.out.println("\n\t\tmin\t\t max");

        for (int i = 0; i < arr.row; i++){
            min = max = arr.getArr()[i][0];
            for (int j = 0; j < arr.cols; j++){
                if (min > arr.getArr()[i][j]){
                    min = arr.getArr()[i][j];
                }
                if (max < arr.getArr()[i][j]){
                    max = arr.getArr()[i][j];
                }
            }
            System.out.println(i + " row:  " + min + "\t\t " + max);
        }
    }
}
