//        Есть два двумерных массива (матрицы размером
//        2x2), заполненные случайными числами. Найдите сумму
//        матриц, разницу матриц, произведение матриц.

public class Task8 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        Matrix matrixRes = new Matrix(2, 2);
        matrix1.initMatrix();
        matrix2.initMatrix();
        matrix1.show();
        System.out.println();
        matrix2.show();

        //сумма матриц

        for (int i = 0; i < matrixRes.row; i++){
            for (int j = 0; j < matrixRes.cols; j++){
                matrixRes.getArr()[i][j] = matrix1.getArr()[i][j] + matrix2.getArr()[i][j];
            }
        }
        matrixRes.show();
    }
}
