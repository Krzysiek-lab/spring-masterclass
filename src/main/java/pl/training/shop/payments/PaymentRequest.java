package pl.training.shop.payments;

import lombok.Builder;
import lombok.Value;
import org.javamoney.moneta.FastMoney;

@Builder                       // to wzorzec projektowy builder
@Value                         // dzieki tej adnotacji z lomboka pola beda oznaczone jako private i bedziemy mieli do nich tez gettery
public class PaymentRequest {

    Long id;
    FastMoney money;        // to po to by miec ta klase wsciagalismy w pom'ie zaleznosc org.javamoney.moneta


}
