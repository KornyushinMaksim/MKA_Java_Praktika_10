//        В двумерноммассиве, заполненномслучайными числами,
//        определить минимальный и максимальный элементы
//        для каждого столбца. Результаты вывести на экран.

public class Task7 {
    public static void main(String[] args) {
        Matrix arr = new Matrix(5, 5);
        arr.initMatrix();
        arr.printMatrix();
        arr.show();
        int min, max;

        System.out.println("\n\t\tmin\t\t max");

        for (int j = 0; j < arr.cols; j++){
            min = max = arr.getArr()[0][j];
            for (int i = 0; i < arr.row; i++){
                if (min > arr.getArr()[i][j]){
                    min = arr.getArr()[i][j];
                }
                if (max < arr.getArr()[i][j]){
                    max = arr.getArr()[i][j];
                }
            }
            System.out.println(j + " cols:  " + min + "\t\t " + max);
        }
    }
}

