package Variable;

public class Exo12 {

    public static void main(String[] args) {
        String target42 = "42";
        String my42on4Time = "42424242";
        String my42on1Time = "quarante-deux ";
        my42on4Time = my42on4Time.replace(target42, my42on1Time);

        System.out.println("My 42 on 4 time : " + my42on4Time);

    }
}