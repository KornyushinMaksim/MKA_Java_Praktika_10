import java.util.Arrays;

public class Matrix {
    int row;
    int cols;
    int arr[][];

    Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int row, int cols, int value) {
        this.arr[row][cols] = value;
    }

    public void initMatrix() {
        arr = new int[row][cols];
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j] = (int) (Math.random() * 50);
            }
        }
    }
    public void initMatrix(int value, int indexRow, int indexCols){
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++){
                if (i == indexRow && j == indexCols){
                    this.arr[i][j] = value;
                }
            }
        }
    }

    public void show (){
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if (arr[i][j] < 10) {
                    System.out.print("  " + this.arr[i][j]);
                }
                else {
                    System.out.print(" " + this.arr[i][j]);
                }
            }
            System.out.println();
        }
    }


    public void printMatrix (){
        System.out.println(Arrays.deepToString(this.arr));
    }

}
