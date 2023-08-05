public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Shridhar", 3);
        System.out.println("Name: " + pair1.getFirst());
        System.out.println("Age: " + pair1.getSecond());
        
        Pair<String, String> pair2 = new Pair<>("Ram", "Chandra");
        System.out.println("First Name: " + pair2.getFirst());
        System.out.println("Last Name: " + pair2.getSecond());

        Pair<Integer, Double> pair3 = new Pair<>(6, 15.24);
        System.out.println("Inch: " + pair3.getFirst());
        System.out.println("Centimeter: " + pair3.getSecond());

    }
}
