package pl.training.shop.payments;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class FakePaymentService implements PaymentService {

    // wazna uwaga to pole jest typu interfejsu a dokladnie klasy ktora go implementuje
    private final PaymentIdGenerator paymentIdGenerator; // hermetyzacja czyli pola private i final musza byc

    @Override
    public Payment process(PaymentRequest paymentRequest) {
        return Payment.builder()                        // do vara mozna dawac obiekty, o to nie tylko typy prymitywne, var to taki niby Object!!!
                .id(paymentIdGenerator.getNext())
                .money(paymentRequest.getMoney())
                .timestamp(Instant.now())
                .status(PaymentStatus.STARTED)
                .build();

    }


}

