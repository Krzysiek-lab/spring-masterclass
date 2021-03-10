package pl.training.shop.payments;

import org.javamoney.moneta.FastMoney;

import javax.money.Monetary;
import java.util.Locale;

public class LocalMoney {
    public static FastMoney off(Number number) {

        var local = Locale.getDefault();                    // pobiera informacje w jakim kraju jestesmy
        var currencyUnit = Monetary.getCurrency(local);     // zwraca informacje jaka waluta jest w bieżącym kraju
        return FastMoney.of(number, currencyUnit);          // zwraca pieniadze z waluta biezacego kraju
    }
}
