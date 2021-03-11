import lombok.extern.java.Log;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.training.shop.payments.*;

@Log
public class Application {
    private static final String BASE_PACKAGE = "pl.training.shop";

    public static void main(String[] args) {
        var paymentIdGeneretaor = new IncrementalPaymentIdGenerator();
            var paymentService = new FakePaymentService(paymentIdGeneretaor);
            var paymentRequest = PaymentRequest.builder()
                    .money(LocalMoney.off(1000))
                    .build();
            var payment = paymentService.process(paymentRequest);
            log.info(payment.toString());

        }

    }

