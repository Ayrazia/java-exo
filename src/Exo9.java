public class Exo9 {
    public static void main(String[] args) {

        int rand = (int) (Math.random() * (1 - 42));
        boolean is42 = rand == 42;

        System.out.println("Is 42 ? " + is42);
    }
}
