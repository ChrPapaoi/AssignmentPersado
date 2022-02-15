package utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Utils {
    public Number sanitizePrice(String price) {
        Number number = null;
        try {
            number = NumberFormat.getCurrencyInstance(Locale.US).parse(price.trim());
        } catch (ParseException e) {
            System.console().printf(e.getMessage());
        }
        return number;
    }
}
