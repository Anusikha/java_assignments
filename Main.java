public class Main {
    public static void main(String[] args) {
        Container<String, Integer> container = new Container<>("Height", 180);
        System.out.println("\n"+ container.getKey());
        System.out.println(container.getValue());
        
        container.setValue(185);
        System.out.println("\n"+ container.getKey());
        System.out.println(container.getValue());
        
        System.out.println("\n"+ container.toString());
    }
}