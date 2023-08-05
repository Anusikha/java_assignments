public class Vector implements MathOperations {
    double[] data;
    
    public Vector(double[] data) {
        this.data = data;
    }
    
    public MathOperations add(MathOperations other) {
        Vector v = (Vector) other;
        double[] result = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] + v.data[i];
        }
        return new Vector(result);
    }
    
    public MathOperations multiply(MathOperations other) {
        Vector v = (Vector) other;
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] * v.data[i];
        }
        return new Vector(new double[] {sum});
    }
}
