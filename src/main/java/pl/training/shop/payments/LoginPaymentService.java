package pl.training.shop.payments;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
@Log
@RequiredArgsConstructor
public class LoginPaymentService implements PaymentService {

    private final FakePaymentService paymentService;


    @CreatedAnnotation
    @Override
    public Payment process(PaymentRequest paymentRequest) {
        var payment = paymentService.process(paymentRequest);
        return payment;
    }


}
