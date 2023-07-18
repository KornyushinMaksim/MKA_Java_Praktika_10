//        Пользователь с клавиатуры вводит элементы двумерного массива (3x3).
//        Необходимо найти сумму элементов массива,
//        среднеарифметическое, отобразить на экран все элементы массива.

public class Task5 {
    public static void main(String[] args) {
        Matrix arr = new Matrix(3, 3);
        arr.initMatrix();
        arr.printMatrix();
        int sum = 0, avarge = 0;

        for (int i = 0; i < arr.row; i++){
            for (int j = 0; j < arr.cols; j++){
                sum += arr.getArr()[i][j];
            }
        }
        System.out.printf("сумма - %d\nсреднеарифметическое - %d", sum, sum / (arr.row * arr.cols));
    }
}
