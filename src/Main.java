public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        MatrixReverser reverser = new MatrixReverser(matrix);
        reverser.reverseColumns();
    }
}
