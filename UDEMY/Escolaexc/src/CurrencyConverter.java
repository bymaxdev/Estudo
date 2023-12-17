public class CurrencyConverter {
    public static final double DOL = 3.10;

    public static void howMuch(double value){
        double result = (value * DOL);
        System.out.printf("Valor a ser pago em reais: %.2f", result * 1.06);
    }

}
