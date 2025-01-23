package org.benedict;

public class ImageConversion {

    public static int[][] flip(int size, int[][] arr) {
        // Invertuojam spalvas
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = arr[i][j] == 0 ? 1 : 0; // Sukeičiam 0 ir 1
            }
        }
        return arr; // Grąžinam patį masyvą
    }

    public static int[][] rotate(int size, int[][] arr) {
        // Sukam naudodami kitą masyvą
        int[][] rotated = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotated[j][size - i - 1] = arr[i][j];
            }
        }
        return rotated;
    }

    public static void rotateInline(int size, int[][] arr) {
        // Modifikuojam
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        // Apverčiam eiles
        for (int i = 0; i < size; i++) {
            int left = 0, right = size - 1;
            while (left < right) {
                int tmp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = tmp;
                left++;
                right--;
            }
        }
    }

    public static void print2D(int[][] data) {
        for (int[] row : data) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }


}
