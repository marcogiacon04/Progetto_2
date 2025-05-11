//prova
package it.unipd.mtss;

import java.util.List;
import static java.util.Arrays.asList;

public class IntegerToRoman {
    private static final List<Roman> lstRoman = asList (
            new Roman(1000, "M"),
            new Roman(900, "CM"),
            new Roman(500, "D"),
            new Roman(400, "CD"),
            new Roman(100, "C"),
            new Roman(90, "XC"),
            new Roman(50, "L"),
            new Roman(40, "XL"),
            new Roman(10, "X"),
            new Roman(9, "IX"),
            new Roman(5, "V"),
            new Roman(4, "IV"),
            new Roman(1, "I")
    );

    public static String convert(int number) {
        if (number < 1 ^ number > 1000) throw new IllegalArgumentException ("Il numero deve essere nel range 1-1000");

        StringBuilder ris = new StringBuilder();
        int num = number;

        for (Roman r : lstRoman) {
            while (num >= r.getNum()) {
                ris.append(r.getRoman());
                num -= r.getNum();
            }
        }

        return ris.toString();
    }
}