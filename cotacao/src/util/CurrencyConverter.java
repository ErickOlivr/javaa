package util;

public class CurrencyConverter {
    public static double TAXIOF = 6.0/100;

    public static double conversor(double price,double quantity_dollars){
        double gross_reais = price * quantity_dollars;
        return (gross_reais * TAXIOF) + gross_reais;
    }
}
