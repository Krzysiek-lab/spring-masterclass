package pl.training.shop.payments;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDPaymentIdGenerator implements PaymentIdGenerator {

    @Override
    public String getNext() {
        return UUID.randomUUID().toString();// zwacamy losowe id generowane na podstawie czasu i danych komputera tego
    }
}

// poza metoda prawy przycisk myszki i refactor i etract interface zrobi nam interfejs z ta metoda i klasa g dzie ta metoda wczesniej byla poprostu bedzie
// implementwac ten interfejs i ta metode