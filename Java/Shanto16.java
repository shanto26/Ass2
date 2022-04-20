import java.util.Random;
public class Shanto16{

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int r = 16, c = 16;

        int[][] a = new int[r][c];

        for(int i = 0 ; i < r; i++){
            for(int j = 0 ; j < c; j++){
                Random rn = new Random();
                int x = rn.nextInt(10) + 1;
                a[i][j] = x;
            }
        }

        int[][] b = new int[r][c];

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c; j++){
                Random rn = new Random();
                int x = rn.nextInt(10) + 1;
                b[i][j] = x;
            }
        }


        int[][] product = mul(a, b, r, c);

        display(product);
        long end = System.nanoTime();

    long endTime   = System.nanoTime();
    long totalTime = endTime - startTime;
    System.out.println(totalTime + " Nanosecond");

    }

    public static int[][] mul(int[][] firstMatrix, int[][] secondMatrix, int r, int c) {
        int[][] product = new int[r][c];
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return product;
    }

    public static void display(int[][] product) {
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}