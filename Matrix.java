public class Matrix implements MathOperations {
    double[][] data;

    public Matrix(double[][] data) {
        this.data = data;
    }

    public MathOperations add(MathOperations other) {
        Matrix m = (Matrix) other;
        double[][] result = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[i][j] = data[i][j] + m.data[i][j];
            }
        }
        return new Matrix(result);
    }

    public MathOperations multiply(MathOperations other) {
        Matrix m = (Matrix) other;
        double[][] result = new double[data.length][m.data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < m.data[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < data[0].length; k++) {
                    sum += data[i][k] * m.data[k][j];
                }
                result[i][j] = sum;
            }
        }
        return new Matrix(result);
    }
}
