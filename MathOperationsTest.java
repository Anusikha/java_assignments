import java.util.Arrays;

public class MathOperationsTest {
    public static void main(String[] args) {
        Vector v1 = new Vector(new double[] {1, 2, 3});
        Vector v2 = new Vector(new double[] {4, 5, 6});
        System.out.println("\n Vectors:\n v1 = " + Arrays.toString(v1.data) + "\n v2 = " + Arrays.toString(v2.data));
        Vector v3 = (Vector) v1.add(v2);
        System.out.println("\n v1 + v2 = " + Arrays.toString(v3.data));
        Vector v4 = (Vector) v1.multiply(v2);
        System.out.println("\n v1 * v2 = " + v4.data[0]);
        
        Matrix m1 = new Matrix(new double[][] {{1, 2}, {3, 4}});
        Matrix m2 = new Matrix(new double[][] {{5, 6}, {7, 8}});
        System.out.println("\n Matrices:\n m1 = " + Arrays.deepToString(m1.data) + "\n m2 = " + Arrays.deepToString(m2.data));
        Matrix m3 = (Matrix) m1.add(m2);
        System.out.println("\n m1 + m2 = " + Arrays.deepToString(m3.data));
        Matrix m4 = (Matrix) m1.multiply(m2);
        System.out.println("\n m1 * m2 = " + Arrays.deepToString(m4.data) + "\n");
    }
}
