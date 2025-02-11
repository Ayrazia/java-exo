package Variable;

import java.util.Optional;

public class Exo5 {

    public static void main (String[] args) {
    Integer var1 = null;
    int result = Optional.ofNullable(var1).orElse(42);

    System.out.println(result);

    int var2 = 10;
    int result2 = Optional.ofNullable(var2).orElse(42);

    System.out.println(result2);


    }

}
