package k17_1.garkavenko;

import java.util.stream.IntStream;

public class Matrix {
    private int[][] arr;

    public Matrix(int n) {
        this.arr = new int[n][n];
    }

    public void AutoComplete() {
        int n = this.arr.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                this.arr[i][j] = (int) Math.round((Math.random() * 30) - 15);
    }

    public void CompleteMatrix(int[][] input_array) {
        if (input_array.length != this.arr.length) {
            System.out.println("Ошибка");
            return;
        }
        this.arr = input_array;
    }

    public int FoundCountOfColumnsWithoutZero() {
        int n = this.arr.length;
        int[][] arr = this.arr;
        int count = 0;
        for (int j = 0; j < n; j++) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }

    public int[] GetSumOfPositiveNumbers() {
        int n = this.arr.length;
        int[] positiveSum = new int[n];
        int[][] arr = this.arr;
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                positiveSum[count++] = IntStream.of(arr[i]).sum();
            }
        }
        return positiveSum;
    }

    public void PrintMatrix() {
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(ints[j] + " ");
            System.out.print("\n");
        }
    }

    public int[][] GetMatrix(){
        return this.arr;
    }
}