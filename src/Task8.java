//        Есть два двумерных массива (матрицы размером
//        2x2), заполненные случайными числами. Найдите сумму
//        матриц, разницу матриц, произведение матриц.

public class Task8 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        matrix1.initMatrix();
        matrix2.initMatrix();
        matrix1.show();
        System.out.println();
        matrix2.show();

        //сумма матриц
        Matrix summMtrx = matrix1.sumMtrx(matrix2);
        System.out.println("\nсумма");
        summMtrx.show();

        //разность матриц
        Matrix diffMtrx = matrix1.diffMtrx(matrix2);
        System.out.println("\nразность");
        diffMtrx.show();

        //умножение матриц
        Matrix multiMtrx = matrix1.multiMtrx(matrix2);
        System.out.println("\nумножение");
        multiMtrx.show();
    }
}
