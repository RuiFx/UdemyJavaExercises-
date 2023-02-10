package util;

public class CurrencyConverter {

    public static double dolar;
    public static double value;
    public static double euro;

    public static double currencyConverter(){
        euro = (dolar * value) * 1.06;
        return euro;
    }
}
