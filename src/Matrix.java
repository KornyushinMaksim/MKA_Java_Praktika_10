import java.util.Arrays;

public class Matrix {
    int row;
    int cols;
    int[][] arr;

    Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
        this.arr = new int[row][cols];
    }

//    public Matrix() {

//    }

    public int[][] getArr() {
        return arr;
    }

    public void initMatrix() {
        arr = new int[row][cols];
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j] = (int) (Math.random() * 50);
            }
        }
    }

    public void initMatrix(int value, int indexRow, int indexCols) {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if (i == indexRow && j == indexCols) {
                    this.arr[i][j] = value;
                }
            }
        }
    }

    public void show() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if (arr[i][j] < 10) {
                    if (arr[i][j] < 0) {
                        if (arr[i][j] < -9) {
                            System.out.print("  " + this.arr[i][j]);
                        } else {
                            System.out.print("   " + this.arr[i][j]);
                        }
                    } else {
                        System.out.print("    " + this.arr[i][j]);
                    }
                }
                else if (arr[i][j] < 100) {
                    if (arr[i][j] < 0) {
                        System.out.print("  " + this.arr[i][j]);
                    } else {
                        System.out.print("   " + this.arr[i][j]);
                    }
                }
                else {
                    System.out.print("  " + this.arr[i][j]);
                }
            }
            System.out.println();
        }
    }


    public void printMatrix() {
        System.out.println(Arrays.deepToString(this.arr));
    }

    public Matrix sumMtrx(Matrix obj) {
        Matrix resMtrx = new Matrix(this.row, this.cols);
        for (int i = 0; i < resMtrx.row; i++) {
            for (int j = 0; j < resMtrx.cols; j++) {
                resMtrx.arr[i][j] = this.arr[i][j] + obj.arr[i][j];
            }
        }
        return resMtrx;
    }

    public Matrix diffMtrx(Matrix obj) {
        Matrix resMtrx = new Matrix(this.row, this.cols);
        for (int i = 0; i < resMtrx.row; i++) {
            for (int j = 0; j < resMtrx.cols; j++) {
                resMtrx.arr[i][j] = this.arr[i][j] - obj.arr[i][j];
            }
        }
        return resMtrx;
    }

    public Matrix multiMtrx(Matrix obj) {
        Matrix resMtrx = new Matrix(this.row, this.cols);
        for (int i = 0; i < resMtrx.row; i++){
            for (int j = 0; j < resMtrx.cols; j++){
                resMtrx.arr[i][j] = this.arr[i][0] * obj.arr[0][j] + this.arr[i][1] * obj.arr[1][j];
            }
        }
        return resMtrx;
    }

    public void initMatrix (int value){
        this.arr = new int[this.row][this.cols];
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++){
                this.arr[i][j] = value;
                value += 7;
            }
        }
    }

}
