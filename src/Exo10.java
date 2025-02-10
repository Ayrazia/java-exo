public class Exo10 {

    public static void main(String[] args) {
        byte my42Byte = 10;
        short my42Short = 20;
        int my42Int = 42;
        long my42Long = 123456789L;
        float my42Float = 3.14f;
        double my42Double = 3.14159;
        char my42Char = 'A';
        boolean my42Boolean = true;
        String my42String = "Hello, World!";

        System.out.println("Type de my42Byte: " + ((Object)my42Byte).getClass().getName());
        System.out.println("Type de my42Short: " + ((Object)my42Short).getClass().getName());
        System.out.println("Type de my42Int: " + ((Object)my42Int).getClass().getName());
        System.out.println("Type de my42Long: " + ((Object)my42Long).getClass().getName());
        System.out.println("Type de my42Float: " + ((Object)my42Float).getClass().getName());
        System.out.println("Type de my42Double: " + ((Object)my42Double).getClass().getName());
        System.out.println("Type de my42Char: " + ((Object)my42Char).getClass().getName());
        System.out.println("Type de my42Boolean: " + ((Object)my42Boolean).getClass().getName());
        System.out.println("Type de my42String: " + my42String.getClass().getName());
    }

}
